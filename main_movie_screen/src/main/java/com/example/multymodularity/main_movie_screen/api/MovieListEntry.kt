package com.example.multymodularity.main_movie_screen.api

import com.example.core.navigarion.ComposableFeatureEntry

abstract class MovieListEntry : ComposableFeatureEntry {
    final override val featureRoute = "movie-list"

    fun destination() = featureRoute
}