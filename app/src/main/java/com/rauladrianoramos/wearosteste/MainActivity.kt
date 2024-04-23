package com.rauladrianoramos.wearosteste

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var buttonAperte: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonAperte = findViewById(R.id.button_aperte)

        buttonAperte.setOnClickListener {
            val intent = Intent(this, DetalheActivity::class.java)

            startActivity(intent)
        }
    }
}