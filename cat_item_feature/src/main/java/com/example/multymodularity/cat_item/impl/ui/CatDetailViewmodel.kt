package com.example.multymodularity.cat_item.impl.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.core.domain.Cat
import com.example.multymodularity.cat_item.impl.cat.GetCat
import com.example.multymodularity.cat_item.impl.di.CatId
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

class CatDetailViewmodel @Inject constructor(
    @CatId private val catId: String,
    private val getCat: GetCat,
) : ViewModel() {

    val cat = MutableStateFlow<Cat?>(null)

    fun loadCat() {
        viewModelScope.launch(Dispatchers.IO) {
            val cats = getCat.invoke(catId)
            cat.value = cats
        }
    }
}