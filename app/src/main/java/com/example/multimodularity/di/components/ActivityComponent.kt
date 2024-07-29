package com.example.multimodularity.di.components

/*
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
}*/
