package com.example.languagelearning

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.splash.*


class Splash : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.splash)

        start1.setOnClickListener {

             val intent = Intent(this,Login::class.java)
             startActivity(intent)

        }


    }


}