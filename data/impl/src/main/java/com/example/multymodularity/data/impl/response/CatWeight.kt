package com.example.multymodularity.data.impl.response

import com.google.gson.annotations.SerializedName

data class CatWeight(
    @SerializedName("metric")
    val weight: String
)