package com.hanifkf.awesomeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calculator.*

class CalculatorActivity : AppCompatActivity(),CalculatorView {
    lateinit var operator: Operator
    var number1 = 0
    var number2 = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        operator = Operator(this)
        button_plus.setOnClickListener {
            number1 = edit_number1.text.toString().toInt()
            number2 = edit_number2.text.toString().toInt()
            operator.calculatePlus(number1,number2)
        }
    }

    override fun showResult(result: String) {
        text_result.text = result
    }
}
