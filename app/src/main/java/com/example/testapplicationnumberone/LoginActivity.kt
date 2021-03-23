package com.example.testapplicationnumberone

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.testapplicationnumberone.main.MainActivity
import com.example.testapplicationnumberone.prefs.SharedPreferencesManager
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        initOnClicks()
    }

    private fun initOnClicks() {
        btnStart.setOnClickListener { onStartClick() }
    }

    private fun onStartClick() {
        SharedPreferencesManager.saveCredentials(etLogin.text.toString())
        Toast.makeText(this, "Text saved", Toast.LENGTH_SHORT).show()
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    private fun startBtn1() {

    }
}