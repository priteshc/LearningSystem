package com.example.languagelearning

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.splash.*
import android.media.MediaPlayer
import android.net.Uri
import android.os.Handler
import android.widget.Toast
import kotlinx.android.synthetic.main.login.*


class Login : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.login)


        back12.setOnClickListener {
            finish()
        }

        login.setOnClickListener {


                if(username.text.toString().equals("admin")&& password.text.toString().equals("1234")) {

                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                }
                else{
                    Toast.makeText(this,"please enter valid credentials",Toast.LENGTH_SHORT).show()

                }

        }

        txt_signup.setOnClickListener {

            val intent = Intent(this, Signup::class.java)
            startActivity(intent)
        }

    }




}