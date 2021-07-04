package org.codeway.myapplication4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val num1 = findViewById<EditText>(R.id.number)
        val btn = findViewById<Button>(R.id.button)
        val ans = findViewById<TextView>(R.id.cal)

        btn.setOnClickListener(){

            val value1 = num1.text.toString().toInt()
            val f =(value1* 9/5)+32
            ans.text=f.toString()
        }
    }
}