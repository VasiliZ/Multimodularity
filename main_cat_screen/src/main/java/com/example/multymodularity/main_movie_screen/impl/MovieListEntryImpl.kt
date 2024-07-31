package com.example.multymodularity.main_cat_screen.impl

import androidx.compose.runtime.Composable
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavHostController
import com.example.core.common.di.LocalCommonProvider
import com.example.core.common.di.injectedViewModel
import com.example.core.navigarion.Destinations
import com.example.core_network.di.component.LocalDataProvider
import com.example.multymodularity.main_cat_screen.api.CatListEntry
import com.example.multymodularity.main_cat_screen.impl.di.DaggerCatListComponent
import com.example.multymodularity.main_cat_screen.ui.CatListScreen
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

        CatListScreen(viewModel)
    }
}