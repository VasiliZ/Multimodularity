package com.example.core_network.di.impl

import androidx.paging.ExperimentalPagingApi
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.example.core.domain.Cat
import com.example.core.domain.CatsRepository
import com.example.core_network.di.paging.PaginationSource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

private const val PREFETCH_DISTANCE = 2

class CatsRepositoryImpl
@Inject constructor(
    private val source: PaginationSource
) : CatsRepository {

    override fun getCats(): Flow<PagingData<Cat>> {
        return configurePager()
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
            pagingSourceFactory = { source }
        ).flow
    }
}