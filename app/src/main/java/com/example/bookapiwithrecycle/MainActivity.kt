package com.example.bookapiwithrecycle

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import com.example.bookapikotlin.*
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    var recyclerView:RecyclerView? =null
    //var layoutManager: LinearLayoutManager? =null
    var mAdapter: MyAdapter? =null
    var list: RecyclerView?=null





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = my_recycler_view

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView?.setHasFixedSize(true)

        // use a linear layout manager
        recyclerView?.layoutManager = LinearLayoutManager(this)

        // specify an adapter (see also next example)

        list= my_recycler_view


        val retrofit = Retrofit.Builder().baseUrl("https://www.googleapis.com/").addConverterFactory(
            GsonConverterFactory.create()
        )
            .build()
        val api = retrofit.create(BookAPI::class.java)
        val call = api.getBook()


        call.enqueue(object : Callback<BookObject> {
            override fun onResponse(call: Call<BookObject>, response: Response<BookObject>) {
                Log.v("ResponseMainActivity", "True Respons!!!")

                Log.v("ResponseMainActivity", response.isSuccessful.toString() + "")
                // Log.v("ResponseMainActivity"," "+"the body is :"+response.code());
                showdata(response)

            }

            override fun onFailure(call: Call<BookObject>, t: Throwable) {
                Log.v("MainActivityFailiare ", t.message)

            }
        })
    }

    private fun showdata(response: Response<BookObject>) {
        val resp = response.body()

        Log.v(
            "ResponseMainActivity",
            "Book Object the kind: " + resp?.kind + "Total Items :" + resp?.totalItems + " Items Size:" + (resp?.items?.size
                    )
        )
     //   val adap = BookAdapter(this, resp?.getItems() as ArrayList<Item>)
        val arr = resp?.items?.map {
            it.volumeInfo
        }?.filterNotNull()

        mAdapter = MyAdapter(arr.orEmpty());
        recyclerView?.adapter = mAdapter;
        list?.setAdapter(mAdapter)


//        for (item in resp.getItems() as ArrayList<Item>) {
//            Log.v(
//                "ResponseMainActivity", "List Of Books " + " id: " + item.getId() + " kind: " + item.getKind() +
//                        " Salf Link: " + item.getSelfLink()
//            )
//        }





    }
}


