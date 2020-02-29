package com.hanifkf.calculatorapp

class Controller(var view : ResultView){
    fun calculate(screen : String, operator : String){
        var angka = screen.split(operator)
        if(operator == "+"){
            var hasil = angka[0].toDouble() + angka[1].toDouble()
            view.showResult(hasil.toInt().toString())
        }
    }

}