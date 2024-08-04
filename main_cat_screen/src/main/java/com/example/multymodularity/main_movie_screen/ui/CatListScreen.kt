package com.example.multymodularity.main_cat_screen.ui

import androidx.compose.animation.Crossfade
import androidx.compose.runtime.Composable
import androidx.paging.LoadState
import androidx.paging.compose.collectAsLazyPagingItems
import com.example.multymodularity.main_cat_screen.impl.CatListViewModel
import com.example.multymodularity.main_movie_screen.ui.LoadedDataScreenState
import com.example.multymodularity.main_movie_screen.ui.LoadingDataScreenState

@Composable
fun CatListScreen(
    viewModel: CatListViewModel,
    onCatItemClicked: (catId: String) -> Unit
) {
    val catList = viewModel.cats.collectAsLazyPagingItems()

    Crossfade(catList.loadState.refresh) {
        when (it) {
            is LoadState.Loading -> LoadingDataScreenState()
            else -> LoadedDataScreenState(catList, onCatItemClicked)
        }
    }
}