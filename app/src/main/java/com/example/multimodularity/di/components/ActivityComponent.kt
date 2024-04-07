package com.example.multimodularity.di.components

import com.example.core.provider.AppDependencyProvider
import com.example.core.provider.NetworkProvider
import com.example.core_network.di.component.NetworkRetrofitComponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    dependencies = [
        NetworkProvider::class
    ]
)
interface ActivityComponent : AppDependencyProvider {

    companion object {
        var activityComponent: ActivityComponent? = null

        fun init(): ActivityComponent {
            val networkProvider = NetworkRetrofitComponent.init()

            return DaggerActivityComponent
                .builder()
                .networkProvider(networkProvider)
                .build()
                .apply {
                    activityComponent = this
                }
        }
    }
}