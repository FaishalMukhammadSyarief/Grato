package com.zhalz.grato.ui.main

import android.content.Context
import android.content.Intent
import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import com.zhalz.grato.ui.MainActivity2

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

    fun navigateToOtherActivity(context: Context) {
        val intent = Intent(context, MainActivity2::class.java)
        context.startActivity(intent)
    }
}