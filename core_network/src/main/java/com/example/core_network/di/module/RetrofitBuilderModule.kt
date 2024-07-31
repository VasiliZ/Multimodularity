package com.example.core_network.di.module

import com.example.core_network.di.api.CatApi
import com.example.core_network.di.api.CatApi.Companion.BASE_URL
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
    fun provideCatApi(
        okHttpClient: OkHttpClient,
        gsonConverterFactory: GsonConverterFactory
    ): CatApi {
        return Retrofit.Builder()
            .addConverterFactory(gsonConverterFactory)
            .client(okHttpClient)
            .baseUrl(BASE_URL)
            .build()
            .create()
    }
}