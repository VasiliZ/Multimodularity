package com.example.multimodularity

import android.app.Application
import com.example.core.common.di.DaggerCommonComponent
import com.example.core_network.di.component.DaggerNetworkComponent
import com.example.multimodularity.di.components.AppProvider
import com.example.multimodularity.di.components.DaggerAppComponent
import com.example.multymodularity.data.impl.di.DaggerRepositoryComponent

class MultiModuleApp : Application() {

    lateinit var appComponentProvider: AppProvider
        private set

    override fun onCreate() {
        super.onCreate()

        val commonProvider = DaggerCommonComponent.factory().create(this)
        appComponentProvider = DaggerAppComponent
            .builder()
            .commonProvider(commonProvider)
            .networkProvider(DaggerNetworkComponent.builder().build())
            .repositoryProvider(
                DaggerRepositoryComponent.factory().create(DaggerNetworkComponent.builder().build())
            )
            .build()
    }
}

val Application.applicationProvider: AppProvider
    get() = (this as MultiModuleApp).appComponentProvider