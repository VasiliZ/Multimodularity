package com.example.multimodularity.details.impl.di

import com.example.core.common.di.CommonProvider
import com.example.core.common.di.FeatureScope
import com.example.multimodularity.detail.api.CatDetailsProvider
import com.example.multimodularity.details.impl.cat.GetCat
import com.example.multimodularity.details.impl.ui.CatDetailViewmodel
import com.example.multymodularity.data.impl.RepositoryProvider
import dagger.BindsInstance
import dagger.Component

@FeatureScope
@Component(
    dependencies = [RepositoryProvider::class, CommonProvider::class],
    modules = [CatDetailsModule::class]
)
interface CatDetailsComponent : CatDetailsProvider,
    RepositoryProvider, CommonProvider {

    val getCat: GetCat

    @get:CatId
    val catId: String

    val viewmodel: CatDetailViewmodel

    @Component.Factory
    interface Factory {
        fun create(
            dataProvider: RepositoryProvider,
            commonProvider: CommonProvider,
            @BindsInstance @CatId catId: String
        ): CatDetailsComponent
    }
}