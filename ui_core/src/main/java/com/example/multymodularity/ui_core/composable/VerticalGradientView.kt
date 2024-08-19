package com.example.multymodularity.ui_core.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.dimensionResource
import com.example.multimodularity.ui_core.R
import com.example.multymodularity.ui_core.theme.verticalGradientColorList

@Composable
fun BoxScope.VerticalGradientView() {
    Box(
        Modifier
            .background(
                brush = Brush.verticalGradient(
                    colors = verticalGradientColorList
                )
            )
            .fillMaxWidth()
            .align(Alignment.BottomEnd)
            .height(dimensionResource(R.dimen.cat_detail_gradient_height))
    )
}