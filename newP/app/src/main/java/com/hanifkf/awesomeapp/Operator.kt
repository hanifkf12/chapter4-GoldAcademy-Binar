package com.hanifkf.awesomeapp

class Operator(var view: CalculatorView){
    fun calculatePlus(number1 : Int, number2 : Int){
        view.showResult("${number1+number2}")
    }
    fun calculateMinus(number1 : Int, number2 : Int){
        view.showResult("${number1-number2}")
    }
    fun calculateTimes(number1 : Int, number2 : Int){
        view.showResult("${number1*number2}")
    }
    fun calculateDivide(number1 : Int, number2 : Int){
        view.showResult("${number1/number2}")
    }
}