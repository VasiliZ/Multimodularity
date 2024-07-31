package com.example.multymodularity.main_cat_screen.impl

import androidx.paging.PagingData
import com.example.core.domain.Cat
import com.example.core.domain.CatsRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject


interface GetCats {
    operator fun invoke(): Flow<PagingData<Cat>>
}

class GetCatListUseCase
@Inject constructor(
    private val catsRepository: CatsRepository,
) : GetCats {

    override fun invoke(): Flow<PagingData<Cat>> {
        return catsRepository.getCats().flowOn(Dispatchers.IO)
    }
}