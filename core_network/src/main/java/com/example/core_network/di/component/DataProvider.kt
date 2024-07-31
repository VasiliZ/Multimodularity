package com.example.core_network.di.component

import androidx.compose.runtime.compositionLocalOf
import com.example.core.domain.CatsRepository

interface DataProvider {

    val catsRepository: CatsRepository
}

val LocalDataProvider = compositionLocalOf<DataProvider> { error("No data provider found!") }