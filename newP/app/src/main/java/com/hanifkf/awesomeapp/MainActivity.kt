package com.hanifkf.awesomeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var count = 0
    lateinit var btnPlus : Button
    lateinit var btnMinus : Button
    lateinit var txtCount : TextView
    val res = mutableListOf(R.id.bottom,R.drawable.bg_edit_number)
    var TAG = "COUNT TAG"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        btnPlus = findViewById(R.id.button_plus)
//        btnMinus = findViewById(R.id.button_minus)
//        txtCount = findViewById(R.id.count_view)
//        btnPlus.setOnClickListener {
//            count++
//            txtCount.text = count.toString()
//        }
//        btnMinus.setOnClickListener {
//            count--
//            txtCount.text = count.toString()
//        }

        button_minus.setOnClickListener {
            count--
            Log.d(TAG,"$count")
            count_view.text=count.toString()
        }
        button_plus.setOnClickListener {
            count++
            Log.d(TAG,"$count")
            count_view.text=count.toString()
        }

    }
}
