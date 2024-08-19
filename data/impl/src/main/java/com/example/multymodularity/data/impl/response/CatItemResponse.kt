package com.example.multymodularity.data.impl.response

import com.google.gson.annotations.SerializedName

data class CatItemResponse(
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("reference_image_id")
    val imageId: String?,
    @SerializedName("description")
    val description: String,
    @SerializedName("weight")
    val weight: CatWeight,
    @SerializedName("wikipedia_url")
    val url: String?
)
