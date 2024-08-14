package com.example.multymodularity.data.impl.di

import com.example.core_network.di.NetworkProvider
import com.example.multymodularity.data.impl.RepositoryProvider
import com.example.multymodularity.data.impl.module.DataModule
import com.example.multymodularity.data.impl.module.RetrofitBuilderModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    dependencies = [
        NetworkProvider::class
    ],
    modules = [DataModule::class, RetrofitBuilderModule::class]
)
interface RepositoryComponent : RepositoryProvider {
    @Component.Factory
    interface Factory {

        fun create(networkProvider: NetworkProvider): RepositoryComponent
    }
}