package com.example.zadankomaj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var zdj = 1
        findViewById<Button>(R.id.button).setOnClickListener {
            if(zdj==1)
        }
    }
}