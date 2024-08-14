package com.example.multymodularity.data.impl

import androidx.compose.runtime.compositionLocalOf

interface RepositoryProvider {

    val catsRepository: CatsRepository
}

val LocalDataProvider = compositionLocalOf<RepositoryProvider> { error("No data provider found!") }