package com.example.multymodularity.main_movie_screen.impl.di

import com.example.multymodularity.main_movie_screen.impl.GetMovieListUseCase
import com.example.multymodularity.main_movie_screen.impl.GetMovies
import dagger.Binds
import dagger.Module

@Module
interface MovieListModule {

    @Binds
    fun bindGetListMovies(useCase: GetMovieListUseCase): GetMovies
}