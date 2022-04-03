package com.example.languagelearning

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.splash.*
import android.media.MediaPlayer
import android.net.Uri
import android.os.Handler
import android.widget.Toast
import kotlinx.android.synthetic.main.edit_profile.*
import kotlinx.android.synthetic.main.login.*
import kotlinx.android.synthetic.main.login.back12
import kotlinx.android.synthetic.main.login.password
import kotlinx.android.synthetic.main.login.username
import kotlinx.android.synthetic.main.signup.*


class EditProfile : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.edit_profile)


        eback12.setOnClickListener {
            finish()
        }

        edit_save.setOnClickListener {

                    finish()

        }



    }




}