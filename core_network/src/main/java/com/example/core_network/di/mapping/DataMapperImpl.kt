package com.example.core_network.di.mapping

import com.example.core.domain.Cat
import com.example.core_network.di.response.CatItemResponse
import javax.inject.Inject

class DataMapperImpl
@Inject constructor() : DataMapper {
    override fun responseToDomain(cat: CatItemResponse): Cat {
        return with(cat) {
            Cat(id = id, name = name)
        }
    }
}