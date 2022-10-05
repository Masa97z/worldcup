package com.masa_97.worldcup.ui


import android.view.LayoutInflater
import com.masa_97.worldcup.databinding.ActivityMainBinding


class MainActivity : baseAvtivity<ActivityMainBinding>() {
    override val bindinginflaytor: (LayoutInflater) -> ActivityMainBinding = ActivityMainBinding::inflate

    override fun setup() {
        open_file()
    }

    override fun call_clicker() {
        TODO("Not yet implemented")
    }

    override val LOG_TAG: String = "MainActivity"



}
