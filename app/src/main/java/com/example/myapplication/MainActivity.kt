package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        }
    fun button(view: View) {
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }
    fun button31(view: View) {
        val intent = Intent(this, Oproge1::class.java)
        startActivity(intent)
    }
}