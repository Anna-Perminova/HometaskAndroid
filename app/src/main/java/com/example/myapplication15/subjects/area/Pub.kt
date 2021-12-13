package com.example.myapplication15.subjects.area

import android.icu.text.CaseMap

open class Pub(
    var name: String,
    var degree: Int,
    var sizeMl: Int,
    var cost: Int,
) {
    open fun lowOrStongAlcogol() {
        if (degree > 15)
            println("It's a low alcogol drink")
        else
            println("It's a strongly alcogol drink")
    }

    open fun description() {
        println("Name of drink: ${name.toString()}")
        println("Number of degrees: ${degree.toString()}")
        println("Size of drink: ${sizeMl.toString()}")
        println("Drink price: ${cost.toString()}")
        println("${lowOrStongAlcogol()}")
    }

    override fun toString(): String {
        return "Pub(name='$name', degree=$degree, sizeMl=$sizeMl, cost=$cost)"
    }
}