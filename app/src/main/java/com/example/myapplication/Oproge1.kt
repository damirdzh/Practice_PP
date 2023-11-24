package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Oproge1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oproge1)
    }

    fun button32(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}