package com.example.multymodularity.main_cat_screen.ui

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.paging.compose.collectAsLazyPagingItems
import com.example.multymodularity.main_cat_screen.impl.CatListViewModel

@Composable
fun CatListScreen(
    viewModel: CatListViewModel
) {
    val catList = viewModel.cats.collectAsLazyPagingItems()

    LazyColumn {
        items(catList.itemCount) {
            catList[it]?.let {
                Text(it.id)
            }
        }
    }
}