package com.example.multymodularity.data.impl.api

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
    ): List<com.example.multymodularity.data.impl.response.CatItemResponse>

    @GET("images/{imageId}")
    suspend fun getImage(
        @Path("imageId") imageId: String
    ): com.example.multymodularity.data.impl.response.CatImageResponse

    @GET("breeds/{breed_id}")
    suspend fun getCat(
        @Path("breed_id") breedId: String
    ): com.example.multymodularity.data.impl.response.CatItemResponse
}