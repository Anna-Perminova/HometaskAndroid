package com.example.myapplication15.subjects.area

import com.example.myapplication15.subjects.area.Pub

open class Wine : Pub {
    var type: String?=null
    var temperature: Int = 0
    var color:String?=null

    constructor(
        name: String,
        degree: Int,
        sizeMl: Int,
        cost: Int,
        type: String,
        temperature: Int,
        color:String
        ) : super(name, degree, sizeMl, cost) {
        this.type = type
        this.temperature = temperature
        this.color=color
    }

    fun hotOrCold() {
        if (temperature > 60)
            println("It's hot type of wine")
        else
            println("It's a cold type of wine ")

    }

    override fun lowOrStongAlcogol() {
        super.lowOrStongAlcogol()
    }

    override fun description() {
        super.description()
        println("Type of wine: ${type}")
        println("${hotOrCold()}")
    }
}