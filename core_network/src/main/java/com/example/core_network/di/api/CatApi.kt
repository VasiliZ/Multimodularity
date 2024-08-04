package com.example.core_network.di.api

import com.example.core_network.di.response.CatImageResponse
import com.example.core_network.di.response.CatItemResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CatApi {

    companion object {
        const val BASE_URL = "https://api.thecatapi.com/v1/"
    }

    @GET("breeds")
    suspend fun getCatList(
        @Query("limit") limit: Int = 10,
        @Query("page") page: Int
    ): List<CatItemResponse>

    @GET("images/{imageId}")
    suspend fun getImage(
        @Path("imageId") imageId: String
    ): CatImageResponse

    @GET("breeds/{breed_id}")
    suspend fun getCat(
        @Path("breed_id") breedId: String
    ): CatItemResponse
}