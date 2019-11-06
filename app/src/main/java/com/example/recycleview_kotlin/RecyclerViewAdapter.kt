package com.example.recycleview_kotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class   RecyclerViewAdapter(val userlist:ArrayList<User>):RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>()
{
    //create viewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v=LayoutInflater.from(parent.context).inflate(R.layout.list_items,parent,false)
        return ViewHolder(v)

    }

//data count from list

    override fun getItemCount(): Int {
      return userlist.size
    }

    //Bind data to the recycler view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

       val user1: User=userlist[position]

        holder.textname.text=user1.Name
        holder.textaddress.text=user1.Address
        holder.image.setImageResource(user1.Image)
    }

    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView)
    {

        val image=itemView.findViewById<ImageView>(R.id.img_id)
        val textname=itemView.findViewById<TextView>(R.id.text_name)
        val textaddress=itemView.findViewById<TextView>(R.id.text_city)

    }
}