package com.example.m5_hw5.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.m5_hw5.R
import com.example.m5_hw5.databinding.ActivityMainBinding
import com.example.m5_hw5.utils.Preferences
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity  : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

     @Inject lateinit var preferences: Preferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)


        if (!preferences.isBoardingShowed()){
            supportFragmentManager.beginTransaction().add(R.id.container, BoardPageFragment()).commit()
        }else{
            supportFragmentManager.beginTransaction().add(R.id.container, InputFragment()).commit()
        }

        setContentView(binding.root)
    }
}