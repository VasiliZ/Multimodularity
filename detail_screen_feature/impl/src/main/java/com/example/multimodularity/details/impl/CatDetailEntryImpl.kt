package com.example.multimodularity.details.impl

import androidx.compose.runtime.Composable
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavHostController
import com.example.core.common.di.LocalCommonProvider
import com.example.core.common.di.injectedViewModel
import com.example.core.navigarion.Destinations
import com.example.multimodularity.detail.api.CatDetailsEntry
import com.example.multimodularity.details.impl.di.DaggerCatDetailsComponent
import com.example.multimodularity.details.impl.ui.CatDetailScreen
import com.example.multymodularity.data.impl.LocalDataProvider
import javax.inject.Inject

class CatDetailEntryImpl
@Inject constructor() : CatDetailsEntry() {

    @Composable
    override fun Composable(
        navController: NavHostController,
        destinations: Destinations,
        backStackEntry: NavBackStackEntry
    ) {
        val catId = backStackEntry.arguments?.getString(ARG_CAT_ID)!!
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