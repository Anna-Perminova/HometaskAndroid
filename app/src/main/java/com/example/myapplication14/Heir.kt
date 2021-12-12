package com.example.myapplication14

open class Heir : User {
val name:String
    constructor(
        firstNum: Int,
        secondNum: Int,
        thirdNum: Int,
        forthNum: Int,
        fifthNub: Int,
        age: Int,
        name:String
    ) : super(firstNum, secondNum, thirdNum, forthNum, fifthNub, age) {

this.name =name
}


    override fun toString(): String {
        return "Heir(name='$name')"
    }


}








