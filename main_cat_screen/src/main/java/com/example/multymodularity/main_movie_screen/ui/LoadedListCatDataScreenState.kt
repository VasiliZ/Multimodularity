package com.example.multymodularity.main_movie_screen.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.paging.LoadState
import androidx.paging.compose.LazyPagingItems
import com.example.core.domain.Cat
import com.example.multymodularity.ui_core.ext.padding16
import com.example.multymodularity.ui_core.ext.space16

private const val GRID_CELL_COUNT = 2
private const val LOADING_PART_SPAN_VALUE = 2

@Composable
fun LoadedDataScreenState(catList: LazyPagingItems<Cat>) {

    LazyVerticalGrid(
        modifier = Modifier
            .padding16()
            .fillMaxWidth(),
        verticalArrangement = Arrangement.space16(),
        horizontalArrangement = Arrangement.space16(),
        columns = GridCells.Fixed(GRID_CELL_COUNT)
    ) {
        items(catList.itemCount) {
            catList[it]?.let {
                CatItem(it)
            }
        }


        item(span = {
            GridItemSpan(LOADING_PART_SPAN_VALUE)
        }) {
            if (catList.loadState.append == LoadState.Loading) {
                LoadingListCatPartState()
            }
        }
    }
}