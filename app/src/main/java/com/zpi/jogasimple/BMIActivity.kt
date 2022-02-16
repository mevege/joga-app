package com.zpi.jogasimple

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_bmiactivity.*
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.NumberFormatException

class BMIActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmiactivity)

        result.text = "-"
        info.text = "-"

        btn.setOnClickListener {
            try {
            var h = height.text.toString().trim().toFloat() / 100
            var w = weight.text.toString().trim().toFloat() / 1
            val res = w / (h * h)
            res.toString().trim().toFloat()
            result.text = "%.2f".format(res)

            if (res > 30) {
                info.text = "otyłość"
            } else if (res >= 25 && res < 29.99) {
                info.text = "nadwaga"
            } else if (res >= 19 && res < 24.99) {
                info.text = "waga prawidłowa"
            }
            else {
                info.text = "niedowaga"
            }}
            catch (e: NumberFormatException){}
        }
    }
}