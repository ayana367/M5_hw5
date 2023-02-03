package com.example.m5_hw5.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.m5_hw5.R
import com.example.m5_hw5.databinding.ActivityMainBinding
import com.example.m5_hw5.utils.Mobile

class MainActivity  : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        if (!Mobile.providePrefs(applicationContext).isBoardingShowed()){
            supportFragmentManager.beginTransaction().add(R.id.container, BoardPageFragment()).commit()
        }else{
            supportFragmentManager.beginTransaction().add(R.id.container, InputFragment()).commit()
        }

        setContentView(binding.root)
    }
}