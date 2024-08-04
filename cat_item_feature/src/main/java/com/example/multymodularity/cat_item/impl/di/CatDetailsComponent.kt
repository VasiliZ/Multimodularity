package com.example.multymodularity.cat_item.impl.di

import com.example.api.CatDetailsProvider
import com.example.core.common.di.CommonProvider
import com.example.core.common.di.FeatureScope
import com.example.core_network.di.component.DataProvider
import com.example.multymodularity.cat_item.impl.cat.GetCat
import com.example.multymodularity.cat_item.impl.ui.CatDetailViewmodel
import dagger.BindsInstance
import dagger.Component

@FeatureScope
@Component(
    dependencies = [DataProvider::class, CommonProvider::class],
    modules = [CatDetailsModule::class]
)
interface CatDetailsComponent : CatDetailsProvider, DataProvider, CommonProvider {

    val getCat: GetCat

    @get:CatId
    val catId: String

    val viewmodel: CatDetailViewmodel

    @Component.Factory
    interface Factory {
        fun create(
            dataProvider: DataProvider,
            commonProvider: CommonProvider,
            @BindsInstance @CatId catId: String
        ): CatDetailsComponent
    }
}