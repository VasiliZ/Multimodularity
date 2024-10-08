package com.example.mulrymodularity.mainscreen.impl.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import com.example.multimodularity.main_screen_feature.impl.R

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