package com.example.languagelearning

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.Gravity

import android.widget.TextView

import android.graphics.Color
import android.opengl.Visibility
import android.util.Log
import android.view.View

import android.widget.TableRow
import androidx.core.view.marginLeft
import com.example.airlinessystem.Model.Formule
import kotlinx.android.synthetic.main.details.*
import android.widget.LinearLayout





class Details : AppCompatActivity() {

    lateinit var filterDataModel : List<Formule>

   var  flag : Int = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.details)

        intent.extras?.let {

            filterDataModel = intent.getSerializableExtra("value") as List<Formule>
            Log.d("Call", filterDataModel.size.toString())

        }

        lang.text = filterDataModel[flag].type.toString()

        setDate(filterDataModel[flag].main.toString(),filterDataModel[flag].native.toString())


        next.setOnClickListener {

            flag++

            if(flag == filterDataModel.size){

                finish.visibility = View.VISIBLE;
                next.visibility = View.GONE;
            }



            prev.visibility = View.VISIBLE;

            if(flag < filterDataModel.size) {

                setDate(
                    filterDataModel[flag].main.toString(),
                    filterDataModel[flag].native.toString()
                )
            }
        }


        finish.setOnClickListener {

            finish();

        }



        prev.setOnClickListener {
            if(flag == 1){
                prev.visibility = View.GONE;

            }
            next.visibility = View.VISIBLE;
            finish.visibility = View.GONE;


            flag --

                setDate(filterDataModel[flag].main.toString(),filterDataModel[flag].native.toString())

        }




    }

    fun setDate(mainlangg : String, native:String){

        main.text = mainlangg;
        nativelang.text = native

    }

}