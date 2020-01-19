package com.example.bookapikotlin

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class VolumeInfo(var x:String="") {
    @SerializedName("title")
    @Expose
     var title: String? = null
        get() = field



    @SerializedName("subtitle")
    @Expose
     var subtitle: String? = null
        get() = field


    @SerializedName("authors")
    @Expose
     var authors: List<String>? = null
        get() = field
    @SerializedName("publisher")
    @Expose
     var publisher: String? = null
        get() = field


    @SerializedName("publishedDate")
    @Expose
     var publishedDate: String? = null
        get() = field
    @SerializedName("description")
    @Expose
     var description: String? = null
        get() = field
    @SerializedName("industryIdentifiers")
    @Expose
     var industryIdentifiers: List<IndustryIdentifier>? = null
        get() = field
    @SerializedName("readingModes")
    @Expose
     var readingModes: ReadingModes? = null
        get() = field
    @SerializedName("printType")
    @Expose
     var printType: String? = null
        get() = field
    @SerializedName("maturityRating")
    @Expose
     var maturityRating: String? = null
        get() = field
    @SerializedName("allowAnonLogging")
    @Expose
     var allowAnonLogging: Boolean? = null
        get() = field
    @SerializedName("contentVersion")
    @Expose
     var contentVersion: String? = null
        get() = field
    @SerializedName("panelizationSummary")
    @Expose
     var panelizationSummary: PanelizationSummary? = null
        get() = field
    @SerializedName("imageLinks")
    @Expose
     var imageLinks: ImageLinks? = null
        get() = field
    @SerializedName("language")
    @Expose
     var language: String? = null
        get() = field
    @SerializedName("previewLink")
    @Expose
     var previewLink: String? = null
        get() = field
    @SerializedName("infoLink")
    @Expose
     var infoLink: String? = null
        get() = field
    @SerializedName("canonicalVolumeLink")
    @Expose
     var canonicalVolumeLink: String? = null
        get() = field
    @SerializedName("pageCount")
    @Expose
     var pageCount: Int? = null
        get() = field


    @SerializedName("categories")
    @Expose
     var categories: List<String>? = null
        get() = field


    @SerializedName("averageRating")
    @Expose
     var averageRating: Double? = null
        get() = field


    @SerializedName("ratingsCount")
    @Expose
     var ratingsCount: Int? = null
        get() = field


}








