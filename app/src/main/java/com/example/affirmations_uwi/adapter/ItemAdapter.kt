package com.example.affirmations_uwi.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations_uwi.R
import com.example.affirmations_uwi.model.Affirmation

class ItemAdapter(private val context: Context, private val dataset: List<Affirmation>):
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>(){

    class ItemViewHolder(private val view:View) : RecyclerView.ViewHolder(view){
        val textView: TextView = view.findViewById(R.id.item_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // create a new view based on the layout defined in the layout resource file
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item,
            parent, false)

        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        //get the specific data item from the list
        val item = dataset[position]

        //populate the actual string based on the resource id and replace the text in the viewholder
        holder.textView.text = context.resources.getString(item.stringResourceId)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}