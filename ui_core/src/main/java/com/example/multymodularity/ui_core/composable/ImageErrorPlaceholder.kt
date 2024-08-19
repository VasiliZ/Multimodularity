package com.example.multymodularity.ui_core.composable

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.multimodularity.ui_core.R

@Composable
fun CatImageErrorPlaceHolder() {
    Box(Modifier.fillMaxWidth()) {
        Icon(
            painter = painterResource(R.drawable.cat),
            contentDescription = null
        )
    }
}