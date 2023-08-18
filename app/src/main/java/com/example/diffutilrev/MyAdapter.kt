package com.example.diffutilrev

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class MyAdapter:ListAdapter<ProgrammningData,MyAdapter.ViewHolder>(DiffUtil()){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_view,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item=getItem(position)
        holder.bind(item)


    }

    class ViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        val initial=itemView.findViewById<TextView>(R.id.textInitial)
        val name=itemView.findViewById<TextView>(R.id.textName)

        fun bind(item:ProgrammningData){
            name.text=item.name
            initial.text=item.initial
        }
    }

    class DiffUtil: androidx.recyclerview.widget.DiffUtil.ItemCallback<ProgrammningData>() {
        override fun areItemsTheSame(
            oldItem: ProgrammningData,
            newItem: ProgrammningData
        ): Boolean {
            return  oldItem.id==newItem.id

        }

        override fun areContentsTheSame(
            oldItem: ProgrammningData,
            newItem: ProgrammningData
        ): Boolean {
            return oldItem == newItem
                    }

    }

}