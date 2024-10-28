package com.example.birthdaycardapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Mengatur tombol untuk membuka Activity template yang sesuai
        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)

        button1.setOnClickListener {
            // Intent menuju TemplateActivity1
            val intent = Intent(this, TemplateActivity1::class.java)
            startActivity(intent)
        }

        button2.setOnClickListener {
            // Intent menuju TemplateActivity2
            val intent = Intent(this, TemplateActivity2::class.java)
            startActivity(intent)
        }

        button3.setOnClickListener {
            // Intent menuju TemplateActivity3
            val intent = Intent(this, TemplateActivity3::class.java)
            startActivity(intent)
        }
    }
}
