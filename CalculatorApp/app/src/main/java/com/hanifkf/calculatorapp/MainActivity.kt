package com.hanifkf.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ResultView {
    var screen = ""
    var operator = ""
    private lateinit var controller: Controller
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        controller = Controller(this)
        button_angka1.setOnClickListener {
            screen += button_angka1.text.toString()
            text_screen.text = screen
        }
        button_angka2.setOnClickListener {
            screen += button_angka2.text.toString()
            text_screen.text = screen
        }
        button_angka3.setOnClickListener {
            screen += button_angka3.text.toString()
            text_screen.text = screen
        }
        button_tambah.setOnClickListener {
            screen += button_tambah.text.toString()
            operator = button_tambah.text.toString()
            text_screen.text = screen
        }
        button_sama_dengan.setOnClickListener {
            controller.calculate(screen,operator)
            screen = ""
            operator = ""
        }

    }

    override fun showResult(result: String) {
        text_screen.text = result
    }
}
