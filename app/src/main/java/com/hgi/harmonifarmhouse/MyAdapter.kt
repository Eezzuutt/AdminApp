package com.hgi.harmonifarmhouse

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val userList: ArrayList<User>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {







    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder {

        val itemView =LayoutInflater.from(parent.context).inflate(R.layout.user_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyAdapter.MyViewHolder, position: Int) {
        val currentitem = userList[position]

        holder.fulName.text = currentitem.fullName
    }

    override fun getItemCount(): Int {
        return userList.size
    }



    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val fulName : TextView = itemView.findViewById(R.id.full_name)

    }
}