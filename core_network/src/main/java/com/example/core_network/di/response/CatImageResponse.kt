package com.example.core_network.di.response

import com.google.gson.annotations.SerializedName

data class CatImageResponse(
    @SerializedName("url")
    val url: String
)
