package com.example.multimodularity.di.components

import androidx.compose.runtime.compositionLocalOf
import com.example.core.common.di.CommonProvider
import com.example.core.navigarion.Destinations
import com.example.core_network.di.NetworkProvider
import com.example.multymodularity.data.impl.RepositoryProvider

interface AppProvider : CommonProvider, RepositoryProvider, NetworkProvider {

    val destinations: Destinations
}

val LocalAppProvider = compositionLocalOf<AppProvider> { error("No app provider found!") }