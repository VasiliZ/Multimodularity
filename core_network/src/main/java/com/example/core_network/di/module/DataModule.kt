package com.example.core_network.di.module

import com.example.core.domain.CatsRepository
import com.example.core_network.di.impl.CatsRepositoryImpl
import com.example.core_network.di.mapping.DataMapper
import com.example.core_network.di.mapping.DataMapperImpl
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
interface DataModule {

    @Binds
    @Singleton
    fun catsRepository(repository: CatsRepositoryImpl): CatsRepository

    @Binds
    @Singleton
    fun dataMapper(mapper: DataMapperImpl): DataMapper
}