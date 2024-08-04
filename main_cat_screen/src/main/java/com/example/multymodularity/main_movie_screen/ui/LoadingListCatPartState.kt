package com.example.multymodularity.main_movie_screen.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import com.example.multymodularity.main_cat_screen.R

@Composable
fun LoadingListCatPartState() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(dimensionResource(R.dimen.append_list_loading_item_height))
    ) {
        CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
    }
}