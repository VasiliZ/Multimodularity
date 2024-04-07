package com.example.core_network.di.producer

import com.example.core.producer.RetrofitServiceProducer
import kotlin.reflect.KClass
import retrofit2.Retrofit

class RetrofitNetworkProducer(private val retrofit: Retrofit) : RetrofitServiceProducer {
    override fun <T : Any> createService(retrofitInterface: KClass<T>): T {
        return retrofit.create(retrofitInterface.java)
    }
}