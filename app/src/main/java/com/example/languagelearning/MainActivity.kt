package com.example.languagelearning

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager
import com.example.languagelearning.Model.LanguageDataModel
import com.example.languagelearning.`interface`.OnLanguageSelect
import com.example.languagelearning.adapter.CourseAdapter
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_main.*
import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.io.Serializable

class MainActivity : AppCompatActivity(), OnLanguageSelect {

    lateinit var courseAdapter: CourseAdapter
     var userlist : ArrayList<String> = ArrayList()
    lateinit var  todoItem: LanguageDataModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userlist.add("French");
        userlist.add("Italian");
        userlist.add("Spanish");
        userlist.add("Portuguese");
        userlist.add("German");


        val gson = Gson()
        val i: InputStream = this.assets.open("data.json")
        val br = BufferedReader(InputStreamReader(i))
        todoItem= gson.fromJson(br, LanguageDataModel::class.java)


        val mLayoutManager = GridLayoutManager(this,2)
        courseAdapter = CourseAdapter(this,this)
        recycler.layoutManager = mLayoutManager
        recycler.itemAnimator = DefaultItemAnimator()

        courseAdapter.setList(userlist)
        recycler.adapter = courseAdapter


        propic.setOnClickListener {

            val intent = Intent(this, EditProfile::class.java)
            startActivity(intent)

        }

        mback12.setOnClickListener {
            finish()
        }

    }

    override fun onLangSelect(language: String) {

        val filtered = todoItem.formules?.filter { data -> data.type!!.equals(language) }

        if (filtered!!.size > 0) {

            val intent = Intent(this, Details::class.java)

            intent.putExtra("value", filtered as Serializable)
            startActivity(intent)
        }


    }
}