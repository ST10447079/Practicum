package com.st10447079.myweatherapp2

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.st10447079.myweatherapp2.ui.theme.MyWeatherApp2Theme

private fun Button.setOnClickListener(show: Unit) {
    TODO("Not yet implemented")
}

class MainActivity : ComponentActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.weather_app)

        // get the days of the week
        val daysOfWeek = findViewById<TextView>(R.id.daysOfWeek)
        //set the text view's day to monday
        var daysOfWeekTextView = null
        var Monday = null
        var Tuesday = null
        var Wednesday = null
        var Thursday = null
        var Friday = null
        var Saturday = null
        var Sunday = null


        // set the text view's to the string representation of the days
        val daysDisplay = null
        val daysOfWeekTextView.code= daysDisplay

        //to go to the next page

        val nextButton = findViewById<Button>(R.id.nextButton)
        nextButton?.setOnClickListener(
            Toast.makeText(this@MainActivity,
            "Button CLicked", Toast. LENGTH_LONG).show()

    }
}

private fun Nothing?.also(function: (Nothing?) -> Unit) {
    
}
