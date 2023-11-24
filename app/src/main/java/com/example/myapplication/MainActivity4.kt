package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
    }

    fun button7(view: View) {
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }

    fun button14(view: View) {
        val intent = Intent(this, lozhnopenok5::class.java)
        startActivity(intent)
    }

    fun button15(view: View) {
        val intent = Intent(this, svinyshka6::class.java)
        startActivity(intent)
    }

    fun button16(view: View) {
        val intent = Intent(this, zhelchniy7::class.java)
        startActivity(intent)
    }

    fun button17(view: View) {
        val intent = Intent(this, poganka8::class.java)
        startActivity(intent)
    }
    fun ImgView12(view: View) {
        val intent = Intent(this, lozhnopenok5::class.java)
        startActivity(intent)
    }

    fun ImgView13(view: View) {
        val intent = Intent(this, svinyshka6::class.java)
        startActivity(intent)
    }

    fun ImgView14(view: View) {
        val intent = Intent(this, zhelchniy7::class.java)
        startActivity(intent)
    }

    fun ImgView8(view: View) {
        val intent = Intent(this, poganka8::class.java)
        startActivity(intent)
    }
}