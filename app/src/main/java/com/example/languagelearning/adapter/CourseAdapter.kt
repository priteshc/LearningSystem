package com.example.languagelearning.adapter

import android.content.Context
import android.content.Intent
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.languagelearning.R
import com.example.languagelearning.`interface`.OnLanguageSelect

import kotlinx.android.synthetic.main.item_courseadapter.view.*


class CourseAdapter(private val c: Context,var onLanguageSelect: OnLanguageSelect) :
    RecyclerView.Adapter<CourseAdapter.BeatsViewHolder>() {
    private var userlist: List<String>? = null

    fun setList(userlist1 : List<String>){
       this.userlist = userlist1
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BeatsViewHolder {

        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_courseadapter, parent, false)

        return BeatsViewHolder(v)

    }


    override fun getItemCount(): Int {
        if(userlist != null) {
            return userlist!!.size
        }
        return 0
    }

    override fun onBindViewHolder(holder: BeatsViewHolder, position: Int) {

        holder.itemView.setOnClickListener(View.OnClickListener {

            onLanguageSelect.onLangSelect(userlist?.get(position).toString())

        })

        holder.mName.text = userlist?.get(position);


    }

    inner class BeatsViewHolder(v: View) : RecyclerView.ViewHolder(v)  {

        var mName: TextView



        init {

            mName = v.name

        }



    }
}