package com.example.myapplication
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import android.content.Intent
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputText = findViewById<EditText>(R.id.inputText)
        val btnConvert = findViewById<Button>(R.id.btnConvert)
        val outputText = findViewById<TextView>(R.id.outputText)
        val btnToggle = findViewById<Button>(R.id.btnToggleTheme)


        fun toggleTheme() {

            if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_NO) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }
        }
        btnToggle.setOnClickListener {
            toggleTheme()
        }

        btnConvert.setOnClickListener {
            val text = inputText.text.toString()
            val upperText = text.uppercase()
            outputText.text = upperText
        }
        val btnGo = findViewById<Button>(R.id.btnSecondPage)
        btnGo.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}
