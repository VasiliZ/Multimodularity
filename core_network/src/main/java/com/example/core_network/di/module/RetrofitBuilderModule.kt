package com.example.core_network.di.module

import com.example.core_network.di.api.MovieApi
import com.example.core_network.di.api.MovieApi.Companion.BASE_URL
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module(
    includes = [
        NetworkClientModule::class,
        GsonModule::class
    ]
)
object RetrofitBuilderModule {

    @Provides
    @Singleton
    fun provideRetrofitBuilder(
        okHttpClient: OkHttpClient,
        gsonConverterFactory: GsonConverterFactory
    ): MovieApi {
        return Retrofit.Builder()
            .addConverterFactory(gsonConverterFactory)
            .client(okHttpClient)
            .baseUrl(BASE_URL)
            .build()
            .create()
    }
}