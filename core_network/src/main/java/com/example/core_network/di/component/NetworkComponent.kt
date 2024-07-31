package com.example.core_network.di.component

import com.example.core_network.di.module.DataModule
import com.example.core_network.di.module.RetrofitBuilderModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        DataModule::class,
        RetrofitBuilderModule::class
    ]
)
interface NetworkComponent : DataProvider