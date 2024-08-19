package com.example.multimodularity

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.core.navigarion.ComposableFeatureEntry
import com.example.multimodularity.di.components.LocalAppProvider

@Composable
fun Navigation() {
    val navController = rememberNavController()
    val destinations = LocalAppProvider.current.destinations

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        NavHost(navController, startDestination = destinations.entries.first().value.featureRoute) {
            destinations.entries.forEach { entry ->
                val featureEntry = entry.value
                composable(
                    featureEntry.featureRoute,
                    featureEntry.arguments,
                    featureEntry.deepLinks
                ) {
                    Box(modifier = Modifier.fillMaxSize()) {
                        (featureEntry as? ComposableFeatureEntry)
                            ?.Composable(
                                navController,
                                destinations,
                                it
                            )
                    }
                }
            }
        }
    }
}