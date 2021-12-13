package com.example.myapplication15.singleton

import com.example.myapplication15.subjects.area.*

object Singleton {
    val alcogolDrink: ArrayList<Pub> = arrayListOf(
        Vodka("Svayak", 40, 50, 3, "lime/lemon"),
        Vodka("Neft", 40, 50, 6, "soda"),
        Vodka("Reyka", 40, 50, 4, "juice"),
        Beer("Schlenkerla", 5, 500, 10, "chocolate", "dark, filtered"),
        Beer("Augustier", 6, 500, 9, "bread crust", "light, filtered"),
        Beer("Krusovice", 4, 450, 5, "caramel", "light, filtered"),
        Wine("Ore Dei Sani Passo Premium Rosso", 14, 750, 60, "guit", 10, "red"),
        Wine("Martini Prosecco", 11, 750, 45, "sparkling", 15, "white"),
        Wine("Mulled wine", 10, 350, 15, "quit", 70, "red"),
        Coctails("Tropical", 0, 250, 6, "milk, banana, orange juice, sugar"),
        Coctails("Iceberg inthe ocean", 0, 250, 6, "ice cream, milk, sherry's syrup, yolk"),
        Coctails("Pina Colada", 8, 250, 12, "rum, pineapple juice, ice, milk, coconut milk"),
        Coctails("Limonchello", 10, 250, 12, "vodka, lemon, water, sugar")

    )


}

