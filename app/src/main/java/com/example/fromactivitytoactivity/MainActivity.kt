package com.example.fromactivitytoactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val number = findViewById<TextView>(R.id.number)
        val inc = findViewById<Button>(R.id.inc)
        val dec = findViewById<Button>(R.id.dec)

        inc.setOnClickListener {
            var ans = number.text.toString().toInt()
            ans++
            number.text = ans.toString()
        }
        dec.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("text", number.text)
            startActivity(intent)
        }
    }
}