package com.example.birthdaycardapp

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PrintActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_print1)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val textViewtemp1bg1 = intent.getStringExtra("TEXT1TEMP1") ?: "Default Text"
        val textViewtemp1bg2 = intent.getStringExtra("TEXT2TEMP1") ?: "Default Text"
        val textViewtemp1bg3 = intent.getStringExtra("TEXT3TEMP1") ?: "Default Text"
        val textViewtemp1bg4 = intent.getStringExtra("TEXT4TEMP1") ?: "Default Text"

        Log.d("PrintActivity1", "TEXT1TEMP1: $textViewtemp1bg1")
        Log.d("PrintActivity1", "TEXT2TEMP1: $textViewtemp1bg2")
        Log.d("PrintActivity1", "TEXT3TEMP1: $textViewtemp1bg3")
        Log.d("PrintActivity1", "TEXT4TEMP1: $textViewtemp1bg4")

        findViewById<TextView>(R.id.textViewtemp1bg1).text = textViewtemp1bg1
        findViewById<TextView>(R.id.textViewtemp1bg2).text = textViewtemp1bg2
        findViewById<TextView>(R.id.textViewtemp1bg3).text = textViewtemp1bg3
        findViewById<TextView>(R.id.textViewtemp1bg4).text = textViewtemp1bg4
    }
}
