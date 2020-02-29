package com.hanifkf.newawesomeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {
    var number1 = 0
    var number2 = 0
    var state1 = true
    var state2 = true
    lateinit var controller: Controller
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        controller = Controller(this)
        pil_angka_1.setOnClickListener {
            if (state1){
                it.background = getDrawable(R.drawable.bg_click)
                Log.d("BEBAS", pil_angka_1.text.toString())
                number1 = pil_angka_1.text.toString().toInt()
                state1 = false
            }else{
                Toast.makeText(this,"User Have Select",Toast.LENGTH_SHORT).show()
            }

        }
        pil_angka_2.setOnClickListener {
            if (state1){
                it.background = getDrawable(R.drawable.bg_click)
                Log.d("BEBAS", pil_angka_2.text.toString())
                number1 = pil_angka_2.text.toString().toInt()
                state1 = false
            }else{
                Toast.makeText(this,"User 1 Have Select",Toast.LENGTH_SHORT).show()

            }

        }
        pil2_angka_1.setOnClickListener {
            if(state2){
                it.background = getDrawable(R.drawable.bg_click)
                Log.d("BEBAS", pil2_angka_1.text.toString())
                number2 = pil2_angka_1.text.toString().toInt()
                controller.proses(number1,number2)
                state2 = false
            }else{
                Toast.makeText(this,"User 2 Have Select",Toast.LENGTH_SHORT).show()
            }

        }
        pil2_angka_2.setOnClickListener {
            if (state2){
                it.background = getDrawable(R.drawable.bg_click)
                Log.d("BEBAS", pil2_angka_2.text.toString())
                number2 = pil2_angka_2.text.toString().toInt()
                controller.proses(number1,number2)
                state2 = false
            }else{
                Toast.makeText(this,"User 2 Have Select",Toast.LENGTH_SHORT).show()

            }

        }

        button_reset.setOnClickListener {
            state1 = true
            state2 = true
            text_result.text = "?"
            number1 = 0
            number2 = 0
            pil_angka_1.background = getDrawable(R.drawable.bg_number)
            pil_angka_2.background = getDrawable(R.drawable.bg_number)
            pil2_angka_1.background = getDrawable(R.drawable.bg_number)
            pil2_angka_2.background = getDrawable(R.drawable.bg_number)
        }
    }

    override fun showResult(result: String) {
        text_result.text = result
    }
}
