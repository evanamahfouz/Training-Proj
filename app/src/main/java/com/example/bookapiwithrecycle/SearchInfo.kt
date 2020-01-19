package com.example.bookapikotlin

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class SearchInfo (var txt:String =""){
    @SerializedName("textSnippet")
    @Expose
    private var textSnippet: String? = null
    get() = field


}