package com.example.models

@kotlinx.serialization.Serializable
data class HeroModel(
    val id: Int,
    val name: String,
    val image: String,
    val about: String,
    val rating: Double,
    val power: Int,
    val month: String,
    val day: String,
    val family: String,
    val abilities: List<String>,
    val natureTypes: List<String>,
)
