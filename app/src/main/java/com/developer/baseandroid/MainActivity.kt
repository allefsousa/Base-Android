package com.developer.baseandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.developer.baseandroid.common.viewBinding
import com.developer.baseandroid.common.withBinding
import com.developer.baseandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private val binding: ActivityMainBinding by viewBinding()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}