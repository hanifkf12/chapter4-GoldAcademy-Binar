package com.hanifkf.beautifulapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ResultView {
    var state1 = true
    var state2 = true

    var pil1 = ""
    var pil2 = ""
    var view1 : View? = null
    var view2 : View? = null
    var TAG = "LOG TAG"
    private lateinit var controller: Controller
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        controller = Controller(this)
        btnA1.setOnClickListener {
            if(state1){
                it.background = getDrawable(R.drawable.bg_text)
                pil1 = btnA1.text.toString()
                view1 = it
                state1 = false
                Log.d(TAG, pil1)
            }else{
                Toast.makeText(this,"Can't select more", Toast.LENGTH_SHORT).show()
            }

        }
        btnA2.setOnClickListener {

            if(state2){
                it.background = getDrawable(R.drawable.bg_text)
                pil2 = btnA2.text.toString()
                view2 = it
                state2 = false
                Log.d(TAG, pil2)

            }else{
                Toast.makeText(this,"Can't select more", Toast.LENGTH_SHORT).show()

            }
        }
        btnB1.setOnClickListener {

            if(state1){
                it.background = getDrawable(R.drawable.bg_text)
                pil1 = btnB1.text.toString()
                view1 = it
                state1 = false
                Log.d(TAG, pil1)

            }else{
                Toast.makeText(this,"Can't select more", Toast.LENGTH_SHORT).show()

            }
        }
        btnB2.setOnClickListener {

            if(state2){
                it.background = getDrawable(R.drawable.bg_text)
                pil2 = btnB2.text.toString()
                view2 = it
                state2=false
                Log.d(TAG, pil2)

            }else{
                Toast.makeText(this,"Can't select more", Toast.LENGTH_SHORT).show()

            }
        }
        btnCek.setOnClickListener {
            controller.cekResult(pil1,pil2)
        }
        btnReset.setOnClickListener {
            pil1 = ""
            pil2 = ""
            resetBackground(view1,view2)
            textResult.text = "?"
            state1 = true
            state2 = true
        }
    }

    fun resetBackground(view1 : View?, view2 : View?){
        view1?.background = getDrawable(android.R.color.transparent)
        view2?.background = getDrawable(android.R.color.transparent)
    }

    override fun showResult(result: String) {
        Log.d(TAG,result)
        textResult.text = result
    }
}
