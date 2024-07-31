package com.example.multymodularity.main_cat_screen.api

import com.example.core.navigarion.ComposableFeatureEntry

abstract class CatListEntry : ComposableFeatureEntry {
    final override val featureRoute = "cat-list"

    fun destination() = featureRoute
}