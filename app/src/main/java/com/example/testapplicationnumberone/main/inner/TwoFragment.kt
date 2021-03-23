package com.example.testapplicationnumberone.main.inner

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.testapplicationnumberone.LoginActivity
import com.example.testapplicationnumberone.R
import com.example.testapplicationnumberone.prefs.SharedPreferencesManager
import kotlinx.android.synthetic.main.activity_two.*

class TwoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.activity_two, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnBack?.setOnClickListener {
            SharedPreferencesManager.clear()
            val intent = Intent(context, LoginActivity::class.java)
            startActivity(intent)
            activity?.finish()
        }
    }
}