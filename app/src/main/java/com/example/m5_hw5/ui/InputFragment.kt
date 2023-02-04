package com.example.m5_hw5.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.m5_hw5.R
import com.example.m5_hw5.databinding.FragmentInputBinding
import com.example.m5_hw5.utils.Preferences
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class InputFragment : Fragment() {

    private lateinit var binding: FragmentInputBinding

    @Inject lateinit var preferences: Preferences

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentInputBinding.inflate(LayoutInflater.from(context),container,false)

        text()
        binding.tv.text = preferences.isTextShowed()
        return binding.root
    }

    private fun text() {
        preferences.setTextShowed(binding.tv.text.toString())
    }
}