package com.example.multymodularity.main_movie_screen.impl

import androidx.compose.runtime.Composable
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavHostController
import com.example.core.common.di.LocalCommonProvider
import com.example.core.common.di.injectedViewModel
import com.example.core.navigarion.Destinations
import com.example.core_network.di.component.LocalDataProvider
import com.example.multymodularity.main_movie_screen.api.MovieListEntry
import com.example.multymodularity.main_movie_screen.impl.di.DaggerMovieListComponent
import com.example.multymodularity.main_movie_screen.ui.MovieListScreen
import javax.inject.Inject

class MovieListEntryImpl
@Inject constructor() : MovieListEntry() {

    @Composable
    override fun Composable(
        navController: NavHostController,
        destinations: Destinations,
        backStackEntry: NavBackStackEntry
    ) {
        val commonProvider = LocalCommonProvider.current
        val dataProvider = LocalDataProvider.current

        val viewModel = injectedViewModel {
            DaggerMovieListComponent.builder()
                .commonProvider(commonProvider)
                .dataProvider(dataProvider)
                .build()
                .viewModel
        }

        MovieListScreen(viewModel)
    }
}