package com.example.multimodularity

import android.app.Application
import com.example.core.common.di.DaggerCommonComponent
import com.example.core_network.di.component.DaggerNetworkComponent
import com.example.multimodularity.di.components.AppProvider
import com.example.multimodularity.di.components.DaggerAppComponent

class MultiModuleApp : Application() {

    lateinit var appComponentProvider: AppProvider
        private set

    override fun onCreate() {
        super.onCreate()

        val commonProvider = DaggerCommonComponent.factory().create(this)
        appComponentProvider = DaggerAppComponent
            .builder()
            .commonProvider(commonProvider)
            .dataProvider(DaggerNetworkComponent.builder().build())
            .build()
    }
}

val Application.applicationProvider: AppProvider
    get() = (this as MultiModuleApp).appComponentProvider