package com.example.cloneandroidjr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidjr.R
import com.example.androidjr.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}