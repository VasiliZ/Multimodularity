package com.example.core_network.di.module

import com.example.core.producer.RetrofitServiceProducer
import com.example.core_network.di.producer.RetrofitNetworkProducer
import dagger.Module
import dagger.Provides
import javax.inject.Singleton
import retrofit2.Retrofit

@Module(
    includes = [
        RetrofitBuilderModule::class
    ]
)
object NetworkRetrofitModule {

    @Provides
    @Singleton
    fun provide(retrofitBuilder: Retrofit.Builder): RetrofitServiceProducer {
        return RetrofitNetworkProducer(retrofitBuilder.build())
    }
}