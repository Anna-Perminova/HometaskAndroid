package com.example.myapplication15.subjects.area

open class Beer : Pub {
    open var taste: String? = null
    open var type: String? = null

    constructor(
        name: String,
        degree: Int,
        sizeMl: Int,
        cost: Int,
        taste: String,
        type: String
    ) : super(name, degree, sizeMl, cost) {
        this.taste = taste
        this.type = type
    }

    override fun lowOrStongAlcogol() {
        super.lowOrStongAlcogol()
    }

    override fun description() {
        super.description()
        println("Beer with ${taste} taste")
    }
}

