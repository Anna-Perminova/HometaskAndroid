package com.example.myapplication15.util

import com.example.myapplication15.subjects.area.Beer
import com.example.myapplication15.subjects.area.Coctails
import com.example.myapplication15.subjects.area.Vodka
import com.example.myapplication15.subjects.area.Wine

class Util {
    fun Vodka.getVodka() =
        "name: ${this.name}, degree: ${this.degree}, size: ${this.sizeMl}ml, cost: ${this.cost}, additional companents: ${this.dopComponents}  "

    fun Beer.getBeer() =
        "name: ${this.name}, degree: ${this.degree}, size: ${this.sizeMl}ml, cost: ${this.cost}, taste of beer: ${this.taste}, taste: ${this.type} "

    fun Wine.getWine() =
        "name: ${this.name}, degree: ${this.degree}, size: ${this.sizeMl}ml, cost: ${this.cost}, type: ${this.type}, temperature: ${this.temperature}, color: ${this.color} "

    fun Coctails.getCoctails() =
        "name: ${this.name}, degree: ${this.degree}, size: ${this.sizeMl}ml, cost: ${this.cost}, components: ${this.components} "
}