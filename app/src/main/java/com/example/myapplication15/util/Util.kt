package com.example.myapplication15.util

import com.example.myapplication15.subjects.area.Beer
import com.example.myapplication15.subjects.area.Coctails
import com.example.myapplication15.subjects.area.Vodka
import com.example.myapplication15.subjects.area.Wine

class Util {
    fun Vodka.getVodka() =
        "name: ${getName()}, degree: ${getDegree()}, size: ${getSizeMl()}ml, cost: ${getCost()}, additional companents: ${this.dopComponents}  "

    fun Beer.getBeer() =
        "name: ${getName()}, degree: ${getDegree()}, size: ${getSizeMl()}ml, cost: ${getCost()}, taste of beer: ${this.taste}, taste: ${this.type} "

    fun Wine.getWine() =
        "name: ${getName()}, degree: ${getDegree()}, size: ${getSizeMl()}ml, cost: ${getCost()}, type: ${this.type}, temperature: ${this.temperature}, color: ${this.color} "

    fun Coctails.getCoctails() =
        "name: ${getName()}, degree: ${getDegree()}, size: ${getSizeMl()}ml, cost: ${getCost()}, components: ${this.components} "
}