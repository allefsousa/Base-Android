package com.developer.baseandroid.common.extensions

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

fun ViewModel.launch(block: suspend () -> Unit) {
    viewModelScope.launch {
        block()
    }
}