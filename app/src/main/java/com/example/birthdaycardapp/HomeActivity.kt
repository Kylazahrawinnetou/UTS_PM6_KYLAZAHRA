package com.example.birthdaycardapp

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Switch
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate

class HomeActivity : AppCompatActivity() {

    private lateinit var themeSwitch: Switch
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Inisialisasi SharedPreferences
        sharedPreferences = getSharedPreferences("ThemePrefs", MODE_PRIVATE)

        // Cek dan set tema berdasarkan preferensi yang disimpan
        val isDarkMode = sharedPreferences.getBoolean("dark_mode", false)
        setAppTheme(isDarkMode)

        // Inisialisasi Switch
        themeSwitch = findViewById(R.id.themeSwitch)
        themeSwitch.isChecked = isDarkMode

        // Listener untuk Switch
        themeSwitch.setOnCheckedChangeListener { _, isChecked ->
            setAppTheme(isChecked)
            // Simpan preferensi
            sharedPreferences.edit().putBoolean("dark_mode", isChecked).apply()
        }

        // Inisialisasi tombol
        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)

        button1.setOnClickListener {
            startActivity(Intent(this, TemplateActivity1::class.java))
        }

        button2.setOnClickListener {
            startActivity(Intent(this, TemplateActivity2::class.java))
        }

        button3.setOnClickListener {
            startActivity(Intent(this, TemplateActivity3::class.java))
        }
    }

    private fun setAppTheme(isDarkMode: Boolean) {
        if (isDarkMode) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            Log.d("Theme", "Dark mode activated")
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            Log.d("Theme", "Light mode activated")
        }
    }
}
