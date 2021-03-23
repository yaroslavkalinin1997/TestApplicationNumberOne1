package com.example.testapplicationnumberone.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.testapplicationnumberone.R
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViewPager()
    }

    private fun initViewPager() {
        mainViewPager.adapter = MainPagerAdapter(supportFragmentManager)
        mainTabLayout.setupWithViewPager(mainViewPager)
    }
}