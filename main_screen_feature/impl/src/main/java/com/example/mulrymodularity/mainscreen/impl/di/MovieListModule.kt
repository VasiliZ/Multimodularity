package com.example.mulrymodularity.mainscreen.impl.di

import com.example.mulrymodularity.mainscreen.impl.GetCatListUseCase
import com.example.mulrymodularity.mainscreen.impl.GetCats
import dagger.Binds
import dagger.Module

@Module
interface CatListModule {

    @Binds
    fun bindGetListCats(useCase: GetCatListUseCase): GetCats
}