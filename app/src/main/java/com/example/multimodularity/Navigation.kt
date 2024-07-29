package com.example.multimodularity

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.core.navigarion.find
import com.example.multimodularity.di.components.LocalAppProvider
import com.example.multymodularity.main_movie_screen.api.MovieListEntry

@Composable
fun Navigation() {
    val navController = rememberNavController()
    val destinations = LocalAppProvider.current.destinations

    val movieList = destinations.find<MovieListEntry>()

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        NavHost(navController, startDestination = movieList.destination()) {
            with(movieList) {
                composable(navController, destinations)
            }
        }
    }
}