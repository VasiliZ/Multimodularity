package com.example.multymodularity.cat_item.impl.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier

@Composable
fun CatDetailScreen(viewmodel: CatDetailViewmodel) {
    LaunchedEffect(Unit) {
        viewmodel.loadCat()
    }

    Box(modifier = Modifier.fillMaxSize())
}