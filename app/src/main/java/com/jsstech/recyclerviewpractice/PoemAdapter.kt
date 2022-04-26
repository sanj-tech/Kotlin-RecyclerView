package com.jsstech.recyclerviewpractice

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PoemAdapter(var context:Context,var poemList: MutableList<PoemModel>):
    RecyclerView.Adapter<PoemAdapter.PoemViewHolder>() {
    //lateinit var onPoemClickListener: OnPoemClick

    lateinit var mainActivity: MainActivity

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PoemViewHolder {
        var view=LayoutInflater.from(context).inflate(R.layout.custom_poem_layout,parent,false)
        return PoemViewHolder(view)
    }

    override fun onBindViewHolder(holder: PoemViewHolder, position: Int) {
       holder.poemImageView.setImageResource(poemList[position].poemIamge)
        holder.poemTitleTxt.text=poemList[position].poemName
        holder.poemDescTxt.text=poemList[position].poemName
        holder.itemView.setOnClickListener({
            mainActivity.onClickPoem(position)


        })
    }

    override fun getItemCount(): Int {
       return poemList.size
    }


    class PoemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var poemImageView=itemView.findViewById<ImageView>(R.id.img_poem)
        var poemTitleTxt=itemView.findViewById<TextView>(R.id.poem_title)
        var poemDescTxt=itemView.findViewById<TextView>(R.id.poem_Desc)

    }



    interface  PoemInteface
    {
    fun onClickPoem(position: Int)
    }

    fun setOnClickListener(mainActivity: MainActivity) {
    this.mainActivity=mainActivity
    }

}