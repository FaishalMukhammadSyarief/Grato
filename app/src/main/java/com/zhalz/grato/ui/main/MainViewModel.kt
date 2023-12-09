package com.zhalz.grato.ui.main

import androidx.databinding.ObservableField
import com.zhalz.grato.base.BaseViewModel
import com.zhalz.grato.data.CounterSP
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val counterSP: CounterSP) : BaseViewModel() {

    var counter = ObservableField(counterSP.counter)

    fun increaseCounter() {
        counterSP.counter += 1
        counter.set(counterSP.counter)
    }

    fun decreaseCounter() {
        counterSP.counter -= 1
        counter.set(counterSP.counter)
    }

}