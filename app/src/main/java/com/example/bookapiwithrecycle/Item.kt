package com.example.bookapikotlin

import com.example.bookapiwithrecycle.AccessInfo
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Item(var x:String="") {

    @SerializedName("kind")
    @Expose
     var kind: String? = null

    get() = field

    @SerializedName("id")
    @Expose
     var id: String? = null
    get() = field

    @SerializedName("etag")
    @Expose
     var etag: String? = null
    get() = field

    @SerializedName("selfLink")
    @Expose
     var selfLink: String? = null
    get() = field

    @SerializedName("volumeInfo")
    @Expose
    var volumeInfo: VolumeInfo? = null
    get() = field

    @SerializedName("saleInfo")
    @Expose
     var saleInfo: SaleInfo? = null
    get() = field

    @SerializedName("accessInfo")
    @Expose
     var accessInfo: AccessInfo? = null
    get() = field

    @SerializedName("searchInfo")
    @Expose
     var searchInfo: SearchInfo? = null
    get() = field
    }