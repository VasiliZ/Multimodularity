package com.example.multimodularity.di.components

import com.example.core.common.di.CommonProvider
import com.example.core_network.di.component.DataProvider
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    dependencies = [
        CommonProvider::class,
        DataProvider::class
    ],
    modules = [NavigationModule::class]
)
interface AppComponent : AppProvider