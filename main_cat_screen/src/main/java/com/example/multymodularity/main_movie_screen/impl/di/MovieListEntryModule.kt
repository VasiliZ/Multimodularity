package com.example.multymodularity.main_cat_screen.impl.di

import com.example.core.common.di.FeatureEntryKey
import com.example.core.navigarion.FeatureEntry
import com.example.multymodularity.main_cat_screen.api.CatListEntry
import com.example.multymodularity.main_cat_screen.impl.CatListEntryImpl
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import javax.inject.Singleton

@Module
interface CatListEntryModule {

    @Binds
    @Singleton
    @IntoMap
    @FeatureEntryKey(CatListEntry::class)
    fun catSearchEntry(entry: CatListEntryImpl): FeatureEntry
}