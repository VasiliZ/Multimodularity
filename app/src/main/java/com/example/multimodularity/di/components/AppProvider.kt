package com.example.multimodularity.di.components

import androidx.compose.runtime.compositionLocalOf
import com.example.core.common.di.CommonProvider
import com.example.core.navigarion.Destinations
import com.example.core_network.di.component.DataProvider

interface AppProvider : CommonProvider, DataProvider {

    val destinations: Destinations
}

val LocalAppProvider = compositionLocalOf<AppProvider> { error("No app provider found!") }