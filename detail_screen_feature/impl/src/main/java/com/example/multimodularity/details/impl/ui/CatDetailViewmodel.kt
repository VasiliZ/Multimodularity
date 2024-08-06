package com.example.multimodularity.details.impl.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.core.domain.Cat
import com.example.multimodularity.details.impl.cat.GetCat
import com.example.multimodularity.details.impl.di.CatId
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