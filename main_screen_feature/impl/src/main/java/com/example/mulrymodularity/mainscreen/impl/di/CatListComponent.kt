package com.example.mulrymodularity.mainscreen.impl.di

import com.example.core.common.di.CommonProvider
import com.example.core.common.di.FeatureScope
import com.example.core_network.di.component.DataProvider
import com.example.mulrymodularity.mainscreen.impl.CatListViewModel
import com.example.multymodularity.mainscreen.api.CatListProvider
import dagger.Component

@FeatureScope
@Component(
    dependencies = [CommonProvider::class, DataProvider::class],
    modules = [CatListModule::class]
)
interface CatListComponent : CatListProvider {

    val viewModel: CatListViewModel
}