package com.example.core_network.di.module

import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient

@Module
object NetworkClientModule {

    @Provides
    fun provideNetworkClient(): OkHttpClient {
        return OkHttpClient.Builder().build()
    }
}