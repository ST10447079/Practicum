package com.st10447079.myweatherapp2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ArrayOf<T>(t: T, t1: T, t2: T, t3: T, t4: T, t5: T, any: Any) {

}

class MainActivity2 : AppCompatActivity() {
    // The temperature on the day it was measured
    val days = ArrayOf<String>("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //place the temperatures at the correct place
        val daysOfWeek = findViewById<TextView>(R.id.editText1)
        //give the temperature
        var editText1 = null
        editText1.extension = "25 degrees celcius"
    }
}