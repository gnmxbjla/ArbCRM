package com.example.arbcrm.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.arbcrm.R
import com.example.arbcrm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate (savedInstanceState: Bundle?) {
        super. onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonResult.setOnClickListener {
            val a = binding.StavkaEditTextNumber.toString().toInt()
            val b = binding.LeadEditTextNumber.toString().toInt()
            val c = binding.ApruvEditTextNumber.toString().toInt()
            val d = binding.TrashEditTextNumber.toString().toInt()

            val sum = a+b+c+d

            binding.RoiResulttextView.text = sum.toString()

        }
    }
}