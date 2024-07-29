package com.example.multimodularity.di.components

import com.example.multymodularity.main_movie_screen.impl.di.MovieListEntryModule
import dagger.Module

@Module(
    includes = [
        MovieListEntryModule::class
    ]
)
object NavigationModule