package com.example.multymodularity.cat_item

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.core.common.di.LocalCommonProvider
import com.example.core.common.di.injectedViewModel
import com.example.core.navigarion.Destinations
import com.example.core_network.di.component.LocalDataProvider
import com.example.multymodularity.cat_item.impl.di.DaggerCatDetailsComponent
import com.example.multymodularity.cat_item.impl.ui.CatDetailScreen
import javax.inject.Inject

class CatDetailEntryImpl
@Inject constructor() : com.example.api.CatDetailsEntry() {

    override fun NavGraphBuilder.navigation(
        navController: NavHostController,
        destinations: Destinations
    ) {

        navigation(startDestination = featureRoute, route = "cat-details") {
            composable(featureRoute, arguments) {
                val catId = it.arguments?.getString(ARG_CAT_ID)!!
                val dataProvider = LocalDataProvider.current
                val commonProvider = LocalCommonProvider.current
                val catViewModel = injectedViewModel {
                    DaggerCatDetailsComponent.factory()
                        .create(dataProvider, commonProvider, catId)
                        .viewmodel
                }

                CatDetailScreen(viewmodel = catViewModel)
            }
        }
    }
}