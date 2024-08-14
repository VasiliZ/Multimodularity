package com.example.multymodularity.data.impl.repository

import androidx.paging.ExperimentalPagingApi
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.example.multymodularity.data.impl.CatsRepository
import com.example.multymodularity.data.impl.api.CatApi
import com.example.multymodularity.data.impl.domain.Cat
import com.example.multymodularity.data.impl.mapping.DataMapperImpl
import com.example.multymodularity.data.impl.paging.PaginationSource
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