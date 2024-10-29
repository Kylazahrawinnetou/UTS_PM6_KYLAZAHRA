package com.example.birthdaycardapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TemplateActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_template3)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val editTexttemp3bg1 = findViewById<EditText>(R.id.editTexttemp3bg1)
        val editTexttemp3bg2 = findViewById<EditText>(R.id.editTexttemp3bg2)
        val editTexttemp3bg3 = findViewById<EditText>(R.id.editTexttemp3bg3)
        val editTexttemp3bg4 = findViewById<EditText>(R.id.editTexttemp3bg4)
        val buttonprint3 = findViewById<Button>(R.id.buttonprint3)

        buttonprint3.setOnClickListener {
            val intent = Intent(this, PrintActivity3::class.java).apply {
                putExtra("TEXT1TEMP3", editTexttemp3bg1.text.toString())
                putExtra("TEXT2TEMP3", editTexttemp3bg2.text.toString())
                putExtra("TEXT3TEMP3", editTexttemp3bg3.text.toString())
                putExtra("TEXT4TEMP3", editTexttemp3bg4.text.toString())
            }
            startActivity(intent)
        }
    }
}