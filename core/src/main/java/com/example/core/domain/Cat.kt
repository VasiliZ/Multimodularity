package com.example.core.domain

data class Cat(
    val id: String,
    val image: String? = null,
    val name: String,
    val description: String,
    val weight: String,
    val url: String
)