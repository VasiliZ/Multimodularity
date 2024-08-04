package com.example.api

import androidx.navigation.NamedNavArgument
import androidx.navigation.NavType
import androidx.navigation.navArgument
import com.example.core.navigarion.AggregateFeatureEntry

abstract class CatDetailsEntry : AggregateFeatureEntry {

    protected companion object {
        const val ARG_CAT_ID = "catId"
    }

    final override val arguments: List<NamedNavArgument> = listOf(
        navArgument(ARG_CAT_ID) {
            type = NavType.StringType
        }
    )

    fun destination(catId: String): String {
        return "cat-details/$catId"
    }

    final override val featureRoute: String = "cat-details/{$ARG_CAT_ID}"
}