package com.example.multymodularity.main_movie_screen.impl.di

import com.example.core.common.di.FeatureEntryKey
import com.example.core.navigarion.FeatureEntry
import com.example.multymodularity.main_movie_screen.api.MovieListEntry
import com.example.multymodularity.main_movie_screen.impl.MovieListEntryImpl
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import javax.inject.Singleton

@Module
interface MovieListEntryModule {

    @Binds
    @Singleton
    @IntoMap
    @FeatureEntryKey(MovieListEntry::class)
    fun movieSearchEntry(entry: MovieListEntryImpl): FeatureEntry
}