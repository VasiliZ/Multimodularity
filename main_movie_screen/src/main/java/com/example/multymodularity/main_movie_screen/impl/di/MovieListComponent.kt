package com.example.multymodularity.main_movie_screen.impl.di

import com.example.core.common.di.CommonProvider
import com.example.core.common.di.FeatureScope
import com.example.core_network.di.component.DataProvider
import com.example.multymodularity.main_movie_screen.api.MovieListProvider
import com.example.multymodularity.main_movie_screen.impl.MovieListViewModel
import dagger.Component

@FeatureScope
@Component(
    dependencies = [CommonProvider::class, DataProvider::class]
)
interface MovieListComponent : MovieListProvider {

    val viewModel: MovieListViewModel
}