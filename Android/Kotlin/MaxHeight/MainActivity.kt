package com.example.rollaball

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startButton = findViewById(R.id.start) as Button

        startButton.setOnClickListener {
            val intent = Intent(this, RollBallActivity::class.java)
            startActivity(intent)
        }
    }
}