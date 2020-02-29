package com.hanifkf.beautifulapp

class Controller(var view: ResultView) {
    fun cekResult(pertama : String, kedua : String){
        if (pertama.equals(kedua)){
            view.showResult("==")
        }else{
            view.showResult("!=")
        }
    }
}