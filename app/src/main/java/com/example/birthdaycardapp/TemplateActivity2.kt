package com.example.birthdaycardapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TemplateActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_template2)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val editTexttemp2bg1 = findViewById<EditText>(R.id.editTexttemp2bg1)
        val editTexttemp2bg2 = findViewById<EditText>(R.id.editTexttemp2bg2)
        val editTexttemp2bg3 = findViewById<EditText>(R.id.editTexttemp2bg3)
        val editTexttemp2bg4 = findViewById<EditText>(R.id.editTexttemp2bg4)
        val buttonprint2 = findViewById<Button>(R.id.buttonprint2)

        buttonprint2.setOnClickListener {
            val intent = Intent(this, PrintActivity2::class.java).apply {
                putExtra("TEXT1TEMP2", editTexttemp2bg1.text.toString())
                putExtra("TEXT2TEMP2", editTexttemp2bg2.text.toString())
                putExtra("TEXT3TEMP2", editTexttemp2bg3.text.toString())
                putExtra("TEXT4TEMP2", editTexttemp2bg4.text.toString())
            }
            startActivity(intent)
        }
    }
}

