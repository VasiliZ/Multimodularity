package com.example.multymodularity.main_cat_screen.impl

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.example.core.domain.Cat
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class CatListViewModel
@Inject constructor(
    private val getCats: GetCats
) : ViewModel() {

    private val _cats = getCats.invoke()

    val cats: Flow<PagingData<Cat>> = _cats.cachedIn(viewModelScope)

}