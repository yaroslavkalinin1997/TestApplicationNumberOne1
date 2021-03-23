package com.example.testapplicationnumberone.prefs

import android.app.Application
import android.content.Context
import android.content.SharedPreferences

object SharedPreferencesManager {

    private lateinit var sPref: SharedPreferences

    fun initWithContent(application: Application) {
        sPref = application.getSharedPreferences("MyPref", Context.MODE_PRIVATE)
    }

    fun saveCredentials(login: String) {
        sPref.edit().putString("SAVED_LOGIN", login).apply()
    }

    fun getLogin() = sPref.getString("SAVED_LOGIN", "").orEmpty()

    fun clear() {
        sPref.edit().clear().apply()
    }
}