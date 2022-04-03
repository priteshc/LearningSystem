package com.example.airlinessystem.Model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable


class Formule : Serializable {
    @SerializedName("Main")
    @Expose
    var main: String? = null

    @SerializedName("Native")
    @Expose
    var native: String? = null

    @SerializedName("Type")
    @Expose
    var type: String? = null
}