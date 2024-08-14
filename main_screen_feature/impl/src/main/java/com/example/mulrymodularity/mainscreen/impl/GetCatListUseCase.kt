package com.example.mulrymodularity.mainscreen.impl

import androidx.paging.PagingData
import com.example.core.common.di.CommonModule.IO
import com.example.core.domain.Cat
import com.example.core.domain.CatsRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject
import javax.inject.Named


interface GetCats {
    operator fun invoke(): Flow<PagingData<Cat>>
}

class GetCatListUseCase
@Inject constructor(
    private val catsRepository: CatsRepository,
    @Named(IO) private val ioDispatcher: CoroutineDispatcher
) : GetCats {

    override fun invoke(): Flow<PagingData<Cat>> {
        return catsRepository.getCats().flowOn(ioDispatcher)
    }
}