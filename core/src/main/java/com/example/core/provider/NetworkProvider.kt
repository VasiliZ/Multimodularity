package com.example.core.provider

import com.example.core.producer.RetrofitServiceProducer

interface NetworkProvider {

    fun provideNetwork(): RetrofitServiceProducer
}