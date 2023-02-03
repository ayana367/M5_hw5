package com.example.m5_hw5.ui

import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.m5_hw5.R
import dagger.hilt.android.qualifiers.ApplicationContext

class BoardAdapter (@ApplicationContext fragment: FragmentActivity): FragmentStateAdapter(fragment) {
    private val listBoarding = arrayOf(        Model(
        R.drawable.bro,            "App work",
        "Work in this application you can register and find the vacancy you need",
        false,
        R.color.pur1
    ),
        Model(
            R.drawable.sss,
                    "Application Features",
            "With this application, you can communicate and find the job you need at any time.",
            false,
            R.color.pur2
        ),

        Model(
            R.drawable.www,
                    "Convenience",
            "Thanks to our application, you can find a suitable job for yourself and get a job",
            false,
            R.color.pur3
        ),        Model(
            R.drawable.uuu,
                    "Thank you",
            "Thanks to you we increase our ratings thank you for choosing us",
            true,
            R.color.pur4       )
    )

    override
    fun getItemCount(): Int = listBoarding.size
    override fun createFragment(position: Int): Fragment {
        val data = bundleOf("object" to listBoarding[position])
        val fragment = onBoardFragment()
        fragment.arguments = data
                return fragment
    }

}