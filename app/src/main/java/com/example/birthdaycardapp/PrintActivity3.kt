package com.example.birthdaycardapp

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PrintActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_print3)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val textViewtemp3bg1 = intent.getStringExtra("TEXT1TEMP3") ?: "Default Text"
        val textViewtemp3bg2 = intent.getStringExtra("TEXT2TEMP3") ?: "Default Text"
        val textViewtemp3bg3 = intent.getStringExtra("TEXT3TEMP3") ?: "Default Text"
        val textViewtemp3bg4 = intent.getStringExtra("TEXT4TEMP3") ?: "Default Text"

        Log.d("PrintActivity3", "TEXT1TEMP3: $textViewtemp3bg1")
        Log.d("PrintActivity3", "TEXT2TEMP3: $textViewtemp3bg2")
        Log.d("PrintActivity3", "TEXT3TEMP3: $textViewtemp3bg3")
        Log.d("PrintActivity3", "TEXT4TEMP3: $textViewtemp3bg4")

        findViewById<TextView>(R.id.textViewtemp3bg1).text = textViewtemp3bg1
        findViewById<TextView>(R.id.textViewtemp3bg2).text = textViewtemp3bg2
        findViewById<TextView>(R.id.textViewtemp3bg3).text = textViewtemp3bg3
        findViewById<TextView>(R.id.textViewtemp3bg4).text = textViewtemp3bg4
    }
}