package com.example.core_network.di.module

import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import javax.inject.Singleton

@Module
object NetworkClientModule {

    @Provides
    @Singleton
    fun provideNetworkClient(): OkHttpClient {
        return OkHttpClient.Builder().build()
    }
}