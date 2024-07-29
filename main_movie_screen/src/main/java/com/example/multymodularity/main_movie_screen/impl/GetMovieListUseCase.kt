package com.example.multymodularity.main_movie_screen.impl

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import javax.inject.Inject


interface GetMovies {
    operator fun invoke(): Flow<List<String>> = flowOf(listOf(""))
}

class GetMovieListUseCase @Inject constructor() : GetMovies