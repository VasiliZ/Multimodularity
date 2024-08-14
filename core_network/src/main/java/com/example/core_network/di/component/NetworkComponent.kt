package com.example.core_network.di.component

import com.example.core_network.di.NetworkProvider
import com.example.core_network.di.module.GsonModule
import com.example.core_network.di.module.NetworkClientModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        GsonModule::class,
        NetworkClientModule::class
    ]
)
interface NetworkComponent : NetworkProvider