package com.example.multymodularity.cat_item.impl.di

import com.example.multymodularity.cat_item.impl.cat.GetCat
import com.example.multymodularity.cat_item.impl.cat.GetCatUserCase
import dagger.Binds
import dagger.Module

@Module
interface CatDetailsModule {

    @Binds
    fun bindGetCat(getCatUserCase: GetCatUserCase): GetCat
}