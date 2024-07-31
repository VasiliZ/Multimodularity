package com.example.core_network.di.response

import com.google.gson.annotations.SerializedName

data class CatItemResponse(
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("reference_image_id")
    val imageId: String?
)
