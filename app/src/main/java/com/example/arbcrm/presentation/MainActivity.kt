package com.example.arbcrm.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import com.example.arbcrm.R
import kotlinx.android.synthetic.main.activity_main.*
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_result.setOnClickListener {
            var a = StavkaEditTextNumber.text.toString().toFloat()
            var b = LeadEditTextNumber.text.toString().toFloat()
            var c = ApruvEditTextNumber.text.toString().toFloat()
            var d = TrashEditTextNumber.text.toString().toFloat()

            var pro_C = c/100
            var pro_D = d/100

            val nolik = (a-a*pro_D)*pro_C
            val roi = (nolik-b)/b
            var roi_norm = roi*100
            var roi_end = ("%.2f".format(roi_norm))
            var nolik_end = ("%.2f".format(nolik))


            NolikResultTextView.setText("$nolik_end $")
            RoiResulttextView.setText("$roi_end %")

            when {
                roi_norm < 29 -> imageView.setImageResource(R.drawable.cat_sad)
                roi_norm > 30 -> imageView.setImageResource(R.drawable.cat_good)
            }
        }
    }

}