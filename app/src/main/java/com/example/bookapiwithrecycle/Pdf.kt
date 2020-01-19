package com.example.bookapikotlin

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Pdf(var x:String="") {
    @SerializedName("isAvailable")
    @Expose
    private var isAvailable: Boolean? = null
        get() = field

    @SerializedName("acsTokenLink")
    @Expose
    private var acsTokenLink: String? = null
        get() = field

}