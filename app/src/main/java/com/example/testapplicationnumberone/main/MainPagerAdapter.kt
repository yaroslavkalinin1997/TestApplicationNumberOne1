package com.example.testapplicationnumberone.main

import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.testapplicationnumberone.main.inner.OneFragment
import com.example.testapplicationnumberone.main.inner.TwoFragment

class MainPagerAdapter(fm: FragmentManager) :
    FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private val fragments = listOf(
        OneFragment() to "First",
        TwoFragment() to "Second"
    )

    override fun getCount(): Int = 2

    override fun getItem(position: Int) = fragments[position].first

    override fun getPageTitle(position: Int) = fragments[position].second
}