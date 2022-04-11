package com.example.arbcrm.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import com.example.arbcrm.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_result.setOnClickListener {
            val a = StavkaEditTextNumber.text.toString().toInt()
            val b = LeadEditTextNumber.text.toString().toInt()
            val c = ApruvEditTextNumber.text.toString().toInt()
            val d = TrashEditTextNumber.text.toString().toInt()

            val sum = a+b+c+d

            RoiResulttextView.text = sum.toString()
        }
    }

}