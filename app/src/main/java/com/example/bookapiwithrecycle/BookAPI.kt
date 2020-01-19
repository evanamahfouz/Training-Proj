package com.example.bookapiwithrecycle

import retrofit2.Call
import retrofit2.http.GET

interface BookAPI {
    //val BaseUrl = "https://www.googleapis.com/books/v1/"
    @GET("books/v1/volumes?q=9781451648546")
    fun getBook(): Call<BookObject>
}