package com.example.myapplication15.subjects.area

class Catalog<T> {
    var catalog: ArrayList<Pub> = arrayListOf(
        Vodka("Air", 40, 50, 4, "cola"),
        Beer("Essa", 6, 450, 5, "lime", "light, filtered"),
        Wine("Sangria", 12, 750, 20, "guit", 10, "red"),
        Coctails("Coctail with banana", 0, 250, 6, "milk, banana,ice-cream ")
    )
    override fun toString(): String {
        return "Catalog(menuOfDrinks=${catalog})"
    }



}
