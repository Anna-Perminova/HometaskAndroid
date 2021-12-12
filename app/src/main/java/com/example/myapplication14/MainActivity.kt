package com.example.myapplication

import android.app.Activity
import android.icu.number.IntegerWidth
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.myapplication14.Heir
import com.example.myapplication14.R
import com.example.myapplication14.Util
import java.io.File
import kotlin.random.Random

class MainActivity : Activity() {
    private lateinit var textView: TextView
    private lateinit var button: Button
    private lateinit var textView1: TextView
    private lateinit var button1: Button
    private lateinit var textView2: TextView
    private lateinit var textView3: TextView
    private lateinit var textView4: TextView
    private lateinit var textView5: TextView
    private lateinit var textView6: TextView
    private lateinit var textView7: TextView

    private var counter:Int=0
    val first = Heir(
        Random.nextInt(0,100),
        Random.nextInt(0,100),
        Random.nextInt(0,100),
        Random.nextInt(0,100),
        Random.nextInt(0,100),
        Random.nextInt(0,100),
        "Аnna"
    )
    val second= Util(first)
    val summary =second.summ()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.textView)
        button = findViewById(R.id.button)
        button1 = findViewById(R.id.button1)
        textView2 = findViewById(R.id.textView2)
        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                button.setOnClickListener { textView.text = "I count ${++counter} clicks" }
            }
        })
        button1.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                button1.setOnClickListener { textView2.text = "${summary}"}

            }

        })}


    fun main(args: Array<String>) {
        val amount = 20
        var firstNumber = 0
        var secondNumber = 1

        print("${first.firstNum} + " +
                "${first.secondNum} + " +
                "${first.thirdNum} + " +
                "${first.forthNum} + " +
                "${first.fifthNub} + " +
                "${first.age}"
        )
        print(" = ${summary}")
        val second=Util(first)
        val summary =second.summ()
        print(" = ${summary}")
        println()
        print("First $amount numbers Fibonacci: ")
        for (i in 0..amount) {
            var num = recursion(i)
            print("$num ")
        }
        println(" ")
        print("Second $amount numbers Fibonacci: ")

        for (i in 1..amount) {
            print("$firstNumber ")
            val sum = firstNumber + secondNumber
            firstNumber = secondNumber
            secondNumber = sum

        }
    }

    fun recursion(num: Int): Int {
        if (num <= 0)
            return 0
        else if (num == 1)
            return 1
        else
            return recursion(num - 1) + recursion(num - 2)
    }}











