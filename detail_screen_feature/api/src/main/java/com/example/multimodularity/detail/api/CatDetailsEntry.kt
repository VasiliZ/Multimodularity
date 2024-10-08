package com.example.multimodularity.detail.api

import androidx.navigation.NamedNavArgument
import androidx.navigation.NavType
import androidx.navigation.navArgument
import com.example.core.navigarion.ComposableFeatureEntry

private const val NAVIGATE_PATH = "cat-details/"

abstract class CatDetailsEntry : ComposableFeatureEntry {

    protected companion object {
        const val ARG_CAT_ID = "catId"
    }

    final override val arguments: List<NamedNavArgument> = listOf(
        navArgument(ARG_CAT_ID) {
            type = NavType.StringType
        }
    )

    fun destination(catId: String): String {
        return "$NAVIGATE_PATH$catId"
    }

    final override val featureRoute: String = "$NAVIGATE_PATH{$ARG_CAT_ID}"
}