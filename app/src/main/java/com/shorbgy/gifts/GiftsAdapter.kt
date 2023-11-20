package com.shorbgy.gifts

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.shorbgy.gifts.databinding.ItemGiftBinding

class GiftsAdapter: RecyclerView.Adapter<GiftsAdapter.GiftViewHolder>(){

    var gifts = listOf<Gift>()
        @SuppressLint("NotifyDataSetChanged")
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    class GiftViewHolder(private val binding: ItemGiftBinding): ViewHolder(binding.root){
        fun bind(gift: Gift){
            binding.apply {
                descTv.text = gift.desc
                dayNumberTv.text = gift.day
                containerCl.background = ContextCompat.getDrawable(root.context, gift.img)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GiftViewHolder {
        val binding = ItemGiftBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return GiftViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return gifts.size
    }

    override fun onBindViewHolder(holder: GiftViewHolder, position: Int) {
        val currentItem = gifts[position]
        holder.bind(currentItem)
    }
}