package com.example.calculatorapp

fun main() {

    var a = "-9 - 10"
    var b = ""
    if(a.startsWith("-")) {
        b = a.substring(1)
    }
    var splitValue = a.split(" - ")
    println(b)
}