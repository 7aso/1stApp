package com.example.bottomnav.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.fragment.FragmentWeather
import com.example.fragment.FragmentAlarm
import com.example.fragment.FragmentAndroid

class PagerAdapter(fm:FragmentActivity): FragmentStateAdapter(fm) {
    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FragmentAlarm()
            1 -> FragmentWeather()
            2 -> FragmentAndroid()
            else -> FragmentAlarm()
        }
    }

    override fun getItemCount(): Int {
        return 3
    }

}

