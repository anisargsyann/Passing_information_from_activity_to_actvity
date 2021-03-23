package com.example.fromactivitytoactivity

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        var extraText = intent.getStringExtra("text")
        val number = findViewById<TextView>(R.id.number)
        val inc = findViewById<Button>(R.id.inc)
        val dec = findViewById<Button>(R.id.dec)
        number.text = extraText
        inc.setOnClickListener {
            var ans = number.text.toString().toInt()
            ans++
            number.text = ans.toString()
        }
        dec.setOnClickListener {
            var ans = number.text.toString().toInt()
            ans--
            number.text = ans.toString()
        }

    }
}