package com.example.core_network.di.api

interface MovieApi {

    companion object {
        const val BASE_URL = ""
    }

    suspend fun getMovieList()
}