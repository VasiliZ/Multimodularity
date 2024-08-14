package com.example.multymodularity.data.impl

import androidx.paging.PagingData
import com.example.multymodularity.data.impl.domain.Cat
import kotlinx.coroutines.flow.Flow

interface CatsRepository {

    companion object {
        const val PAGE_SIZE = 10
    }

    fun getCats(): Flow<PagingData<Cat>>

    suspend fun getCat(id: String): Cat?
}