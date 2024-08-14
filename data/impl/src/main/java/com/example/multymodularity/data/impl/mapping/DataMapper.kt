package com.example.multymodularity.data.impl.mapping

import com.example.multymodularity.data.impl.domain.Cat
import com.example.multymodularity.data.impl.response.CatItemResponse

interface DataMapper {

    fun responseToDomain(cat: CatItemResponse): Cat
}