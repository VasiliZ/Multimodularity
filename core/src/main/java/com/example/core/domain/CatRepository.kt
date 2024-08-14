package com.example.core.domain

import androidx.paging.PagingData
import kotlinx.coroutines.flow.Flow

interface CatsRepository {

    companion object {
        const val PAGE_SIZE = 10
    }

    fun getCats(): Flow<PagingData<Cat>>

    suspend fun getCat(id: String): Cat?
}