package com.example.core_network.di.module

import com.example.core.domain.MoviesRepository
import com.example.core_network.di.impl.MoviesRepositoryImpl
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
interface DataModule {

    @Binds
    @Singleton
    fun moviesRepository(repository: MoviesRepositoryImpl): MoviesRepository
}