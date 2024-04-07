package com.example.core_network.di.component

import com.example.core.provider.NetworkProvider
import com.example.core_network.di.module.NetworkRetrofitModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [NetworkRetrofitModule::class]
)
interface NetworkRetrofitComponent : NetworkProvider {

    companion object {

        fun init(): NetworkProvider {
            return DaggerNetworkRetrofitComponent
                .builder()
                .build()
        }
    }

    @Component.Builder
    interface Builder {
        fun build(): NetworkRetrofitComponent
    }
}