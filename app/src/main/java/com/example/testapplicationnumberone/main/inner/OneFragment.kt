package com.example.testapplicationnumberone.main.inner

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.testapplicationnumberone.R
import com.example.testapplicationnumberone.prefs.SharedPreferencesManager
import kotlinx.android.synthetic.main.activity_one.*


class OneFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.activity_one, container, false)
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tvLogin1?.text = "Login: ${SharedPreferencesManager.getLogin()}"
    }
}