package com.example.repository

import com.example.models.ApiResponse
import com.example.models.HeroModel

interface HeroRepository {

    val heroes: Map<Int, List<HeroModel>>

    val page1: List<HeroModel>
    val page2: List<HeroModel>
    val page3: List<HeroModel>
    val page4: List<HeroModel>
    val page5: List<HeroModel>

    suspend fun getAllHeroes(page: Int = 1): ApiResponse

    suspend fun searchHeroes(name: String?): ApiResponse


}