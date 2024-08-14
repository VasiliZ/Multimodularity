package com.example.mulrymodularity.mainscreen.impl

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.example.core.domain.Cat
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class CatListViewModel
@Inject constructor(
    getCats: GetCats
) : ViewModel() {

    private val _cats = getCats.invoke()

    val cats: Flow<PagingData<Cat>> = _cats.cachedIn(viewModelScope)
}