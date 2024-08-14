package com.example.mulrymodularity.mainscreen.impl.di

import com.example.core.common.di.CommonProvider
import com.example.core.common.di.FeatureScope
import com.example.mulrymodularity.mainscreen.impl.CatListViewModel
import com.example.multymodularity.data.impl.RepositoryProvider
import com.example.multymodularity.mainscreen.api.CatListProvider
import dagger.Component

@FeatureScope
@Component(
    dependencies = [CommonProvider::class, RepositoryProvider::class],
    modules = [CatListModule::class]
)
interface CatListComponent : CatListProvider {

    val viewModel: CatListViewModel
}