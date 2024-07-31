package com.example.multymodularity.main_cat_screen.impl.di

import com.example.multymodularity.main_cat_screen.impl.GetCatListUseCase
import com.example.multymodularity.main_cat_screen.impl.GetCats
import dagger.Binds
import dagger.Module

@Module
interface CatListModule {

    @Binds
    fun bindGetListCats(useCase: GetCatListUseCase): GetCats
}