package com.example.myapplication15.subjects.area

import com.example.myapplication15.subjects.area.Pub

open class Vodka : Pub {
    var dopComponents: String = ""

    constructor(
        name: String,
        degree: Int,
        sizeMl: Int,
        cost: Int,
        dopComponents: String
    ) : super(name, degree, sizeMl, cost) {
        this.dopComponents = dopComponents
    }

    override fun lowOrStongAlcogol() {
        super.lowOrStongAlcogol()
    }

    override fun description() {
        super.description()
        println("Vodka with additional companents: ${dopComponents}")
    }
}