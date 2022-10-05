package com.masa_97.worldcup.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.masa_97.worldcup.R
import com.masa_97.worldcup.databinding.ActivityMainBinding

class MainActivity : baseAvtivity<ActivityMainBinding>() {
    override val bindinginflaytor: (LayoutInflater) -> ActivityMainBinding = ActivityMainBinding::inflate

    override fun setup() {
        TODO("Not yet implemented")
    }

    override fun call_clicker() {
        TODO("Not yet implemented")
    }

    override val LOG_TAG: String = "MainActivity"



}
