package com.example.core_network.di

import androidx.compose.runtime.compositionLocalOf

interface NetworkProvider

val LocalNetworkProvider = compositionLocalOf<NetworkProvider> { error("No data provider found!") }