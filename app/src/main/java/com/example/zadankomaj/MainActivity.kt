package com.example.zadankomaj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var czek: CheckBox
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var x = 0;
        findViewById<Button>(R.id.button2).setOnClickListener {
            x--
            if (x == 1) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.z1)
            } else if (x == 2) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.z2)
            } else if (x == 3) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.z3)
            } else if (x == 4) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.z4)
            } else if (x == 0) {
                x = 1
            }
        }
        findViewById<Button>(R.id.button).setOnClickListener {
            x++
            if (x == 1) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.z1)
            } else if (x == 2) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.z2)
            } else if (x == 3) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.z3)
            } else if (x == 4) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.z4)
            }
            else if (x == 5) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.z5)
            } else if (x == 6)
                x = 5
        }
        val imageView = findViewById<ImageView>(R.id.imageView)
        val CheckBox = findViewById<CheckBox>(R.id.checkBox)
        CheckBox.setOnClickListener {
            if (CheckBox.isChecked)
            {
                imageView.setAlpha(0)
            }
            else
            {
                imageView.setAlpha(255)
            }
        }


    }
}