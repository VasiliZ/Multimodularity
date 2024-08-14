package com.example.mulrymodularity.mainscreen.impl

import androidx.compose.runtime.Composable
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavHostController
import com.example.core.common.di.LocalCommonProvider
import com.example.core.common.di.injectedViewModel
import com.example.core.navigarion.Destinations
import com.example.core.navigarion.find
import com.example.core_network.di.component.LocalDataProvider
import com.example.mulrymodularity.mainscreen.impl.di.DaggerCatListComponent
import com.example.multimodularity.detail.api.CatDetailsEntry
import com.example.multymodularity.main_cat_screen.ui.CatListScreen
import com.example.multymodularity.mainscreen.api.CatListEntry
import javax.inject.Inject

class CatListEntryImpl
@Inject constructor() : CatListEntry() {

    @Composable
    override fun Composable(
        navController: NavHostController,
        destinations: Destinations,
        backStackEntry: NavBackStackEntry
    ) {
        val commonProvider = LocalCommonProvider.current
        val dataProvider = LocalDataProvider.current

        val viewModel = injectedViewModel {
            DaggerCatListComponent.builder()
                .commonProvider(commonProvider)
                .dataProvider(dataProvider)
                .build()
                .viewModel
        }

        CatListScreen(viewModel) {
            navController.navigate(
                destinations
                    .find<CatDetailsEntry>()
                    .destination(catId = it)
            )
        }
    }
}