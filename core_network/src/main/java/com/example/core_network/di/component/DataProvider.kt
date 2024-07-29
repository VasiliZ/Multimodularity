package com.example.core_network.di.component

import androidx.compose.runtime.compositionLocalOf
import com.example.core.domain.MoviesRepository

interface DataProvider {

    val moviesRepository: MoviesRepository
}

val LocalDataProvider = compositionLocalOf<DataProvider> { error("No data provider found!") }