package com.example.multymodularity.cat_item.impl.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.multymodularity.cat_item.impl.cat.GetCat
import com.example.multymodularity.cat_item.impl.di.CatId
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class CatDetailViewmodel @Inject constructor(
    @CatId private val catId: String,
    private val getCat: GetCat,
) : ViewModel() {

    fun loadCat() {
        viewModelScope.launch(Dispatchers.IO) {
            getCat.invoke(catId)
        }
    }
}