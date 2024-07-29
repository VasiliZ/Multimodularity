package com.example.core.common.di

import com.example.core.navigarion.FeatureEntry
import dagger.MapKey
import kotlin.reflect.KClass

@MapKey
annotation class FeatureEntryKey(val value: KClass<out FeatureEntry>)