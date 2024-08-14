package com.example.multymodularity.data.impl.module

import com.example.multymodularity.data.impl.CatsRepository
import com.example.multymodularity.data.impl.mapping.DataMapper
import com.example.multymodularity.data.impl.mapping.DataMapperImpl
import com.example.multymodularity.data.impl.repository.CatsRepositoryImpl
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