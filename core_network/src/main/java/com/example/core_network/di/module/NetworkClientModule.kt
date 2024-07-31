package com.example.core_network.di.module

import com.example.core_network.di.AppAuthorizer
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import javax.inject.Singleton

@Module
object NetworkClientModule {

    @Provides
    @Singleton
    fun provideNetworkClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(AppAuthorizer())
            .addInterceptor(HttpLoggingInterceptor().apply { setLevel(HttpLoggingInterceptor.Level.BODY) })
            .build()
    }
}