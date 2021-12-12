package com.example.myapplication14

open class User(
    var firstNum:Int,
    var secondNum:Int,
    var thirdNum : Int,
    val forthNum: Int,
    val fifthNub: Int,
    val age: Int
) {

    override fun toString(): String {
        return "User(firstNum=$firstNum," +
                " secondNum=$secondNum," +
                " thirdNum=$thirdNum," +
                " forthNum=$forthNum," +
                " fifthNub=$fifthNub," +
                " age=$age)"
    }
}

