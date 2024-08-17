package com.example.multimodularity.details.impl.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextLinkStyles
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withLink
import coil.compose.SubcomposeAsyncImage
import com.example.multymodularity.detail_screen_feature.impl.R
import com.example.multymodularity.ui_core.ext.bottomPadding16
import com.example.multymodularity.ui_core.ext.gradientColor
import com.example.multymodularity.ui_core.ext.horizontalPadding16
import com.example.multymodularity.ui_core.ext.space16

@Composable
fun CatDetailScreen(viewmodel: CatDetailViewmodel) {
    LaunchedEffect(Unit) {
        viewmodel.loadCat()
    }

    Box(modifier = Modifier.fillMaxSize()) {

        viewmodel.cat.collectAsState().value?.let { cat ->
            Column(
                verticalArrangement = Arrangement.space16()
            ) {
                Box {
                    SubcomposeAsyncImage(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(dimensionResource(R.dimen.cat_detail_image_height)),
                        model = cat.image,
                        contentDescription = null,
                        contentScale = ContentScale.Crop
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
                            .height(dimensionResource(R.dimen.cat_detail_gradient_height))
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

                Text(
                    modifier = Modifier
                        .horizontalPadding16()
                        .fillMaxWidth(),
                    text = stringResource(R.string.cat_weight_placeholder, cat.weight),
                    color = Color.Black,
                    textAlign = TextAlign.Center
                )

                Text(
                    modifier = Modifier.horizontalPadding16(),
                    text = cat.description,
                    color = Color.Black
                )

                val uriHandler = LocalUriHandler.current

                Text(
                    buildAnnotatedString {
                        append(stringResource(R.string.see_more_label))

                        val link =
                            LinkAnnotation.Url(
                                cat.url,
                                TextLinkStyles(SpanStyle(color = Color.Blue))
                            ) {
                                val url = (it as LinkAnnotation.Url).url
                                uriHandler.openUri(url)
                            }

                        withLink(link) { append(cat.name) }
                    },
                    modifier = Modifier.horizontalPadding16(),
                )
            }
        }
    }
}