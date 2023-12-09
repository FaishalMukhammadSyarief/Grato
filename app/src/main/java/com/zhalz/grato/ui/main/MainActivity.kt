package com.zhalz.grato.ui.main

import android.os.Bundle
import com.zhalz.grato.R
import com.zhalz.grato.base.BaseActivity
import com.zhalz.grato.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>(R.layout.activity_main){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.viewModel = viewModel

    }
}