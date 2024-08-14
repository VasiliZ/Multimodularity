package com.example.multymodularity.data.impl.mapping

import com.example.multymodularity.data.impl.domain.Cat
import com.example.multymodularity.data.impl.response.CatItemResponse
import javax.inject.Inject

class DataMapperImpl
@Inject constructor() : DataMapper {

    override fun responseToDomain(cat: CatItemResponse): Cat {
        return with(cat) {
            Cat(
                id = id,
                name = name,
                image = imageId,
                description = description,
                weight = weight.weight,
                url = url
            )
        }
    }
}