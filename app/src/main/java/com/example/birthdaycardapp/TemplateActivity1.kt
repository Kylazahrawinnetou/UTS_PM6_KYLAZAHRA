package com.example.birthdaycardapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TemplateActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_template1)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val editTexttemp1bg1 = findViewById<EditText>(R.id.editTexttemp1bg1)
        val editTexttemp1bg2 = findViewById<EditText>(R.id.editTexttemp1bg2)
        val editTexttemp1bg3 = findViewById<EditText>(R.id.editTexttemp1bg3)
        val editTexttemp1bg4 = findViewById<EditText>(R.id.editTexttemp1bg4)
        val buttonprint1 = findViewById<Button>(R.id.buttonprint1)

        buttonprint1.setOnClickListener {
            val intent = Intent(this, PrintActivity1::class.java).apply {
                putExtra("TEXT1TEMP1", editTexttemp1bg1.text.toString())
                putExtra("TEXT2TEMP1", editTexttemp1bg2.text.toString())
                putExtra("TEXT3TEMP1", editTexttemp1bg3.text.toString())
                putExtra("TEXT4TEMP1", editTexttemp1bg4.text.toString())
            }
            startActivity(intent)
        }
    }
}
