package com.example.core.producer

import kotlin.reflect.KClass

interface RetrofitServiceProducer {
    fun <T : Any> createService(retrofitInterface: KClass<T>): T
}