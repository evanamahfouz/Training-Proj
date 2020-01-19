package com.example.bookapiwithrecycle

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    var mAdapter: MyAdapter? =null





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // in content do not change the layout size of the RecyclerView
        my_recycler_view?.setHasFixedSize(true)

        // use a linear layout manager
        my_recycler_view?.layoutManager = LinearLayoutManager(this)




        val retrofit = Retrofit.Builder().baseUrl("https://www.googleapis.com/").addConverterFactory(
            GsonConverterFactory.create()
        )
            .build()
        val api = retrofit.create(BookAPI::class.java)
        val call = api.getBook()


        call.enqueue(object : Callback<BookObject> {
            override fun onResponse(call: Call<BookObject>, response: Response<BookObject>) {

                showdata(response)

            }

            override fun onFailure(call: Call<BookObject>, t: Throwable) {
                Log.v("MainActivityFailiare ", t.message)

            }
        })
    }

    private fun showdata(response: Response<BookObject>) {
        val resp = response.body()


        val arr = resp?.items?.map {
            it.volumeInfo
        }?.filterNotNull()

        mAdapter = MyAdapter(arr.orEmpty())
        my_recycler_view?.adapter = mAdapter







    }
}


