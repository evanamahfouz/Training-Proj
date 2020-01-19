package com.example.bookapiwithrecycle

import retrofit2.Call
import retrofit2.http.GET

interface BookAPI {
    @GET("books/v1/volumes?q=9781451648546")
    fun getBook(): Call<BookObject>
}