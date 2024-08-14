package com.example.multimodularity.details.impl.cat

import com.example.multymodularity.data.impl.CatsRepository
import com.example.multymodularity.data.impl.domain.Cat
import javax.inject.Inject

fun interface GetCat {

    suspend operator fun invoke(id: String): Cat?
}

class GetCatUserCase
@Inject constructor(
    private val catsRepository: CatsRepository
) : GetCat {

    override suspend fun invoke(id: String): Cat? {
        return catsRepository.getCat(id)
    }
}