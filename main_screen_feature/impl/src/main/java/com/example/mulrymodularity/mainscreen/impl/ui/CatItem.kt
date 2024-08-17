package com.example.mulrymodularity.mainscreen.impl.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.style.TextAlign
import coil.compose.SubcomposeAsyncImage
import com.example.multymodularity.data.impl.domain.Cat
import com.example.multymodularity.main_screen_feature.impl.R
import com.example.multymodularity.ui_core.ext.bottomPadding16
import com.example.multymodularity.ui_core.ext.clipRoundedCorner8dp
import com.example.multymodularity.ui_core.ext.gradientColor

@Composable
fun CatItem(
    cat: Cat,
    onCatItemClicked: (catId: String) -> Unit
) {

    Card(
        modifier = Modifier
            .clipRoundedCorner8dp()
            .clickable {
                onCatItemClicked(cat.id)
            }
    ) {
        Box {
            SubcomposeAsyncImage(
                modifier = Modifier.height(dimensionResource(R.dimen.cat_card_height)),
                model = cat.image,
                contentDescription = null,
                clipToBounds = true,
                contentScale = ContentScale.Crop,
                loading = {
                    Box(Modifier.fillMaxWidth()) {
                        CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
                    }

                }
            )

            Box(
                Modifier
                    .background(
                        brush = Brush.verticalGradient(
                            colors = gradientColor
                        )
                    )
                    .fillMaxWidth()
                    .align(Alignment.BottomEnd)
                    .height(dimensionResource(R.dimen.cat_card_gradient_height))
            )

            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .bottomPadding16()
                    .align(Alignment.BottomCenter),
                textAlign = TextAlign.Center,
                text = cat.name,
                color = Color.White
            )
        }
    }
}