package com.masa_97.worldcup.ui

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class baseAvtivity<VB:ViewBinding>:AppCompatActivity() {

    abstract val bindinginflaytor : (LayoutInflater) -> VB
    private var _binding :ViewBinding? = null
    protected val binding = _binding as VB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = bindinginflaytor(layoutInflater)
        setContentView(requireNotNull(_binding).root)

        setup()
        call_clicker()
    }
    abstract fun setup()

    abstract fun call_clicker()

    protected fun Log (value:String){
        android.util.Log.d(LOG_TAG , value)

    }

    abstract val LOG_TAG:String
}