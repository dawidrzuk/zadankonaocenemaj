package com.example.zadankomaj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    lateinit var czek: CheckBox
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var x = 0
        val textview = findViewById<TextView>(R.id.textView)
        findViewById<Button>(R.id.button2).setOnClickListener {
            x--
            if (x == 1) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.z1)
                textview.text = "jarek"
            } else if (x == 2) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.z2)
                textview.text = "magical"
            } else if (x == 3) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.z3)
                textview.text = "rafon"
            } else if (x == 4) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.z4)
                textview.text = "kot"
            } else if (x == 0) {
                x = 1
            }
        }
        findViewById<Button>(R.id.button).setOnClickListener {
            x++
            if (x == 1) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.z1)
                textview.text = "jarek"
            } else if (x == 2) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.z2)
                textview.text = "magical"
            } else if (x == 3) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.z3)
                textview.text = "rafon"
            } else if (x == 4) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.z4)
                textview.text = "kot"
            }
            else if (x == 5) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.z5)
                textview.text = "pies"
            } else if (x == 6)
                x = 5
        }
        val imageView = findViewById<ImageView>(R.id.imageView)
        val CheckBox = findViewById<CheckBox>(R.id.checkBox)
        val CheckBox2 = findViewById<CheckBox>(R.id.checkBox2)
        val input = findViewById<EditText>(R.id.editTextNumberDecimal)
        val buttonalpha = findViewById<Button>(R.id.button3)
        CheckBox.setOnClickListener {
            if (CheckBox.isChecked) {
                imageView.setAlpha(0)
            } else {
                imageView.setAlpha(255)
            }

            if (CheckBox2.isChecked)



                buttonalpha.setOnClickListener {
                    val alpha = input.text.toString().toFloat()
                    imageView.alpha = alpha
            }
        }


    }
}