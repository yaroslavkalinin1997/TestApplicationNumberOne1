package com.example.testapplicationnumberone

import android.app.Application
import com.example.testapplicationnumberone.prefs.SharedPreferencesManager

class TestApp : Application() {

    override fun onCreate() {
        super.onCreate()
        SharedPreferencesManager.initWithContent(this)
    }
}