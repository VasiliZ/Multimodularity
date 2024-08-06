package com.example.multimodularity.details.impl.di

import com.example.multimodularity.details.impl.cat.GetCat
import com.example.multimodularity.details.impl.cat.GetCatUserCase
import dagger.Binds
import dagger.Module

@Module
interface CatDetailsModule {

    @Binds
    fun bindGetCat(getCatUserCase: GetCatUserCase): GetCat
}