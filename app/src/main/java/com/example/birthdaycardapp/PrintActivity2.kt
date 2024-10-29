package com.example.birthdaycardapp

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PrintActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_print2)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val textViewtemp2bg1 = intent.getStringExtra("TEXT1TEMP2") ?: "Default Text"
        val textViewtemp2bg2 = intent.getStringExtra("TEXT2TEMP2") ?: "Default Text"
        val textViewtemp2bg3 = intent.getStringExtra("TEXT3TEMP2") ?: "Default Text"
        val textViewtemp2bg4 = intent.getStringExtra("TEXT4TEMP2") ?: "Default Text"

        Log.d("PrintActivity2", "TEXT1TEMP2: $textViewtemp2bg1")
        Log.d("PrintActivity2", "TEXT2TEMP2: $textViewtemp2bg2")
        Log.d("PrintActivity2", "TEXT3TEMP2: $textViewtemp2bg3")
        Log.d("PrintActivity2", "TEXT4TEMP2: $textViewtemp2bg4")

        findViewById<TextView>(R.id.textViewtemp2bg1).text = textViewtemp2bg1
        findViewById<TextView>(R.id.textViewtemp2bg2).text = textViewtemp2bg2
        findViewById<TextView>(R.id.textViewtemp2bg3).text = textViewtemp2bg3
        findViewById<TextView>(R.id.textViewtemp2bg4).text = textViewtemp2bg4
    }
}