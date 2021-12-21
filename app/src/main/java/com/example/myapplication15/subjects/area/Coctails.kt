package com.example.myapplication15.subjects.area

open class Coctails : Pub {
    var components:String?=null
    constructor(
        name: String,
        degree: Int,
        sizeMl: Int,
        cost: Int,
        components:String
    ) : super(name, degree, sizeMl, cost){
        this.components=components
    }

    fun alcogolicOrNonAlcogolic() {
        if (getDegree() > 0)
            println("It's alcogol coctail")
        else
            println("It's a non alcogol coctail")

    }

    override fun lowOrStongAlcogol() {
        super.lowOrStongAlcogol()
    }

    override fun description() {
        super.description()
        println("${alcogolicOrNonAlcogolic()}")
    }

}