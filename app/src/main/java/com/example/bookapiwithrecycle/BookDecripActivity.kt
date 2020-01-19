package com.example.bookapiwithrecycle

import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_book_decrip.*

class BookDecripActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_decrip)

        intent.getStringExtra(ARG_DESC)?.let {
            text_desc?.text = it
        } ?: let {
            text_desc?.text = getString(R.string.no_desc)
            text_desc?.setTextColor(ContextCompat.getColor(this, R.color.colorAccent))
            text_desc?.setPadding(32, 0, 0, 0)
        }
    }

    companion object {
        const val ARG_DESC = "Description"
    }
}
