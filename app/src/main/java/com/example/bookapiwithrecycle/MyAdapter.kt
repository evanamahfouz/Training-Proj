package com.example.bookapiwithrecycle

import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.bookapikotlin.VolumeInfo
import kotlinx.android.synthetic.main.list_quick.view.*

class MyAdapter(private val list: List<VolumeInfo>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    /**
     * View holder class
     */
    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var title = view.txt_title
        var sub_title: TextView? = null
        var authors: TextView? = null
        var click: TextView? = null

        init {
            view.apply {
                title = view.txt_title
                sub_title = txt_subtitle
                authors = txt_authors
                click = txt_click
            }
        }
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val c = list[position]

        holder.apply {
            title?.text = c.title
            sub_title?.text = c.subtitle
            c.authors?.let {
                holder.authors?.append(it.joinToString())
            }

            click?.setOnClickListener {
                val context = itemView.context
                val intent = Intent(context, BookDecripActivity::class.java)
                    .putExtra(BookDecripActivity.ARG_DESC, c.description)
                context?.startActivity(intent)
            }
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_quick, parent, false)

        return MyViewHolder(v)
    }

}