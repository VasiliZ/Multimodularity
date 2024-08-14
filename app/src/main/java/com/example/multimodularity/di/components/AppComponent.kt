package com.example.multimodularity.di.components

import com.example.core.common.di.CommonProvider
import com.example.core_network.di.NetworkProvider
import com.example.multymodularity.data.impl.RepositoryProvider
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    dependencies = [
        RepositoryProvider::class,
        CommonProvider::class,
        NetworkProvider::class,
    ],
    modules = [NavigationModule::class]
)
interface AppComponent : AppProvider