package com.example.multymodularity.mainscreen.api

import com.example.core.navigarion.ComposableFeatureEntry

abstract class CatListEntry : ComposableFeatureEntry {
    final override val featureRoute = "cat-list"

    fun destination() = featureRoute
}