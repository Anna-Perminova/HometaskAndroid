package com.example.myapplication15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.myapplication15.singleton.Singleton
import com.example.myapplication15.subjects.area.*

class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    private lateinit var button: Button
    private lateinit var textView2: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.textView)
        textView2 = findViewById(R.id.textView2)
        var  i=0
        var box = Singleton
        var vodkaFromCatalog =  Vodka("Air", 40, 50, 4, "cola")
        box.alcogolDrink.add(vodkaFromCatalog)
        button = findViewById(R.id.button)
        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                button.setOnClickListener {
                    textView2.text = box.alcogolDrink.toString()
                    i=box.alcogolDrink.size-1
                    textView.text= box.alcogolDrink[i].toString()
                }

            }
        })
    }
}
