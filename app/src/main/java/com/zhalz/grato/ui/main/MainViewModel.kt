package com.zhalz.grato.ui.main

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import com.zhalz.grato.data.CounterSP
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val counterSP: CounterSP) : ViewModel() {
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

}