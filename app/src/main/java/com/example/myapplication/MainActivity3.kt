package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
    }

    fun button4(view: View) {
        val intent = Intent(this, beliygrib5::class.java)
        startActivity(intent)
    }

    fun button5(view: View) {
        val intent = Intent(this, podberezovik6::class.java)
        startActivity(intent)
    }

    fun button6(view: View) {
        val intent = Intent(this, dozhdevik7::class.java)
        startActivity(intent)
    }

    fun button9(view: View) {
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }

    fun button8(view: View) {
        val intent = Intent(this, ryadofka8::class.java)
        startActivity(intent)
    }

    fun ImgView4(view: View) {
        val intent = Intent(this, beliygrib5::class.java)
        startActivity(intent)
    }

    fun ImgView5(view: View) {
        val intent = Intent(this, podberezovik6::class.java)
        startActivity(intent)
    }

    fun ImgView6(view: View) {
        val intent = Intent(this, podberezovik6::class.java)
        startActivity(intent)
    }

    fun ImgView7(view: View) {
        val intent = Intent(this, podberezovik6::class.java)
        startActivity(intent)
    }
}