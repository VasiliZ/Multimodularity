package com.example.multimodularity.di.components

import com.example.mulrymodularity.mainscreen.impl.di.CatListEntryModule
import com.example.multimodularity.details.impl.di.GetCatEntry
import dagger.Module

@Module(
    includes = [
        CatListEntryModule::class,
        GetCatEntry::class
    ]
)
object NavigationModule