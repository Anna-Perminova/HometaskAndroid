package com.example.myapplication15.subjects.area

import android.icu.text.CaseMap

open class Pub(
    private var name: String,
    private var degree: Int,
    private var sizeMl: Int,
    private var cost: Int,
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

    fun getName(): String {
        return name
    }

    fun setName(name: String) {
        this.name =name
    }

    open fun getDegree(): Int {
        return degree
    }

    open fun setDegree(degree: Int) {
        this.degree=degree
    }
    fun getSizeMl(): Int {
        return sizeMl
    }

    fun setSizeMl(sizeMl: Int) {
        this.sizeMl =sizeMl
    }
    fun getCost(): Int {
        return cost
    }

    fun setCost(cost: Int) {
        this.cost =cost
    }
}
