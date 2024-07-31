package com.example.multymodularity.main_cat_screen.impl.di

import com.example.core.common.di.CommonProvider
import com.example.core.common.di.FeatureScope
import com.example.core_network.di.component.DataProvider
import com.example.multymodularity.main_cat_screen.api.CatListProvider
import com.example.multymodularity.main_cat_screen.impl.CatListViewModel
import dagger.Component

@FeatureScope
@Component(
    dependencies = [CommonProvider::class, DataProvider::class],
    modules = [CatListModule::class]
)
interface CatListComponent : CatListProvider {

    val viewModel: CatListViewModel
}