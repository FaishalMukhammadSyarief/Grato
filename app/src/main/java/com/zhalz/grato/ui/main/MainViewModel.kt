package com.zhalz.grato.ui.main

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var counter = ObservableField(0)

    fun increaseCounter() {
        val currentCounter = counter.get() ?: 0
        counter.set(currentCounter + 1)
    }

    fun decreaseCounter() {
        val currentCounter = counter.get() ?: 0
        counter.set(currentCounter - 1)
    }

}