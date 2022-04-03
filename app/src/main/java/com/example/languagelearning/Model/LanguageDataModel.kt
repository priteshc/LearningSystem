package com.example.languagelearning.Model

import com.example.airlinessystem.Model.Formule
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable


class LanguageDataModel : Serializable {
    @SerializedName("formules")
    @Expose
    var formules: List<Formule>? = null
}