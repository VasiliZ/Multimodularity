package com.example.core_network.di

import com.example.multimodularity.core.BuildConfig
import okhttp3.Interceptor
import okhttp3.Response

private const val API_KEY_HEADER = "x-api-key"

class AppAuthorizer : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val originalRequest = chain.request()
        val originalHttpUrl = originalRequest.url

        val url = originalHttpUrl.newBuilder()
            .addQueryParameter(API_KEY_HEADER, BuildConfig.API_KEY)
            .build()

        val request = originalRequest.newBuilder()
            .url(url)
            .build()

        return chain.proceed(request)
    }
}