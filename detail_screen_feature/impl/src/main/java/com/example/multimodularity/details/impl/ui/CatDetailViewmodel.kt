package com.example.multimodularity.details.impl.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.core.common.di.CommonModule.IO
import com.example.core.domain.Cat
import com.example.multimodularity.details.impl.cat.GetCat
import com.example.multimodularity.details.impl.di.CatId
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Named

class CatDetailViewmodel @Inject constructor(
    @CatId private val catId: String,
    private val getCat: GetCat,
    @Named(IO) private val ioDispatcher: CoroutineDispatcher
) : ViewModel() {

    val cat = MutableStateFlow<Cat?>(null)

    fun loadCat() {
        viewModelScope.launch(ioDispatcher) {
            val cats = getCat.invoke(catId)
            cat.value = cats
        }
    }
}