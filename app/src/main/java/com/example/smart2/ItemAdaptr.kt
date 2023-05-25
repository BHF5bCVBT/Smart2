package com.example.smart2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.smart2.databinding.ItemLayoutBinding

class ItemAdaptr(val items:List<ItemModel> ):RecyclerView.Adapter<ItemAdaptr.ItemHolder>() {
    inner class ItemHolder (val binding: ItemLayoutBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(ItemLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
   return items.count()
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
      val item = items[position]
        holder.binding.imgIcon.setImageResource(item.icon)
        holder.binding.tvTitle.text = item.title


    }
}