package com.powernepo.lineaguedragon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.powernepo.lineaguedragon.dataBinding.ComponentNamesDataObservable
import com.powernepo.lineaguedragon.databinding.ActivityMainBinding
import com.powernepo.lineaguedragon.databinding.ComponentNamesBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var componentBinding : ComponentNamesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupBinding()
    }

    override fun onResume() {
        super.onResume()
        componentBinding.data = ComponentNamesDataObservable("Lineague","Dragons")
    }

    private fun setupBinding(){
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        componentBinding = binding.componentNameBinding
    }

    private fun startAnimationUpScreen(){

    }

}