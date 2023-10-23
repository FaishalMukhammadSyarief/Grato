package com.zhalz.grato

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.zhalz.grato.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        DataBindingUtil.setContentView(this, R.layout.activity_main)
    }

    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.access = this

        binding.value = counter.toString()
    }

    fun increaseCounter(){
        counter += 1
        binding.value = counter.toString()
    }
    fun decreaseCounter(){
        counter -= 1
        binding.value = counter.toString()

    }
}