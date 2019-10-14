package com.uty.listviewicon

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class myadapter(var mCtx:Context,var resources:Int,var items:List<model>):ArrayAdapter<model>(mCtx,resources,items)
{
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater:LayoutInflater= LayoutInflater.from(mCtx)
        val view:View=layoutInflater.inflate(resources,null)


        val imageView:ImageView=view.findViewById(R.id.foto)
        val titleTextView:TextView=view.findViewById(R.id.text1)
        val descriptionTextView:TextView=view.findViewById(R.id.text2)
        var mItem:model=items[position]
        imageView.setImageDrawable(mCtx.resources.getDrawable(mItem.img))
        titleTextView.text=mItem.title
        descriptionTextView.text=mItem.description
        return view
    }
}