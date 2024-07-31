package com.example.core_network.di.mapping

import com.example.core.domain.Cat
import com.example.core_network.di.response.CatItemResponse

interface DataMapper {

    fun responseToDomain(cat: CatItemResponse): Cat
}