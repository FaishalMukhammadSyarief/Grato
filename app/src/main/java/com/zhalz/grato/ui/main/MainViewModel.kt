package com.zhalz.grato.ui.main

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.zhalz.grato.data.CounterSP

class MainViewModel(private val counterSP: CounterSP) : ViewModel() {
    var counter = ObservableField(counterSP.counter)

    fun increaseCounter() {
//        val currentCounter = counter.get() ?: 0
        counterSP.counter += 1
        counter.set(counterSP.counter)
    }

    fun decreaseCounter() {
//        val currentCounter = counter.get() ?: 0
        counterSP.counter -= 1
        counter.set(counterSP.counter)
    }

    class Factory(private val counterSP: CounterSP): ViewModelProvider.Factory{
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return MainViewModel(counterSP) as T
        }
    }

}