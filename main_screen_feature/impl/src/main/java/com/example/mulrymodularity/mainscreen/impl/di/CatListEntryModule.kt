package com.example.mulrymodularity.mainscreen.impl.di

import com.example.core.common.di.FeatureEntryKey
import com.example.core.navigarion.FeatureEntry
import com.example.mulrymodularity.mainscreen.impl.CatListEntryImpl
import com.example.multymodularity.mainscreen.api.CatListEntry
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