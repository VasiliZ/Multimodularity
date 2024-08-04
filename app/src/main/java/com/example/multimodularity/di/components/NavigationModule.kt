package com.example.multimodularity.di.components

import com.example.multymodularity.cat_item.impl.di.GetCatEntry
import com.example.multymodularity.main_cat_screen.impl.di.CatListEntryModule
import dagger.Module

@Module(
    includes = [
        CatListEntryModule::class,
        GetCatEntry::class
    ]
)
object NavigationModule