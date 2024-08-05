package com.example.core_network.di.response

import com.google.gson.annotations.SerializedName

data class CatWeight(
    @SerializedName("metric")
    val weight: String
)