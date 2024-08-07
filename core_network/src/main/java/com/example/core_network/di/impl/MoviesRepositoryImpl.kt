package com.example.core_network.di.impl

import androidx.paging.ExperimentalPagingApi
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.example.core.domain.Cat
import com.example.core.domain.CatsRepository
import com.example.core_network.di.api.CatApi
import com.example.core_network.di.mapping.DataMapperImpl
import com.example.core_network.di.paging.PaginationSource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

private const val PREFETCH_DISTANCE = 2

class CatsRepositoryImpl
@Inject constructor(
    private val catListSource: PaginationSource,
    private val catApi: CatApi,
    private val mapperImpl: DataMapperImpl,
) : CatsRepository {

    override fun getCats(): Flow<PagingData<Cat>> {
        return configurePager()
    }

    override suspend fun getCat(id: String): Cat {

        val response = catApi.getCat(id)
        val catImage = if (response.imageId != null) {
            catApi.getImage(response.imageId)
        } else null

        val result = response.copy(imageId = catImage?.url)

        return mapperImpl.responseToDomain(result)
    }

    @OptIn(ExperimentalPagingApi::class)
    private fun configurePager(): Flow<PagingData<Cat>> {
        return Pager(
            config = PagingConfig(
                pageSize = CatsRepository.PAGE_SIZE,
                enablePlaceholders = true,
                prefetchDistance = PREFETCH_DISTANCE
            ),
            remoteMediator = null,
            pagingSourceFactory = { catListSource }
        ).flow
    }
}