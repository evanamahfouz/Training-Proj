package com.example.bookapikotlin

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class BookObject(var x:String="") {

    @SerializedName("kind")
    @Expose
     var kind: String? = null
       get() = field
    @SerializedName("totalItems")
    @Expose
     var totalItems: Int? = null
       get() = field
    @SerializedName("items")
    @Expose
     var items: List<Item>? = null
        get() = field}

