package com.example.core_network.di.component

import com.example.core_network.di.module.DataModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        DataModule::class
    ]
)
interface NetworkComponent : DataProvider