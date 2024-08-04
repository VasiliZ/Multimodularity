package com.example.multymodularity.cat_item.impl.di

import com.example.api.CatDetailsEntry
import com.example.core.common.di.FeatureEntryKey
import com.example.core.navigarion.FeatureEntry
import com.example.multymodularity.cat_item.CatDetailEntryImpl
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import javax.inject.Singleton

@Module
interface GetCatEntry {

    @Binds
    @Singleton
    @IntoMap
    @FeatureEntryKey(CatDetailsEntry::class)
    fun catDetailsEntry(entry: CatDetailEntryImpl): FeatureEntry
}