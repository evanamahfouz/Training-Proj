package com.example.bookapikotlin

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class SaleInfo(var x:String="") {

    @SerializedName("country")
    @Expose
    private var country: String? = null
    get() = field
    @SerializedName("saleability")
    @Expose
    private var saleability: String? = null
    get() = field
    @SerializedName("isEbook")
    @Expose
    private var isEbook: Boolean? = null
    get() = field
}