package com.example.multymodularity.ui_core.ext

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp

fun Modifier.clipRoundedCorner8dp() = clip(RoundedCornerShape(size = 8.dp))