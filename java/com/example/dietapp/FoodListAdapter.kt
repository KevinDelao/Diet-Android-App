package com.example.dietapp


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FoodListAdapter internal constructor(context: Context?) : RecyclerView.Adapter<FoodListAdapter.FoodViewHolder>() {
    inner class FoodViewHolder public constructor(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        val foodItemView: TextView

        init {
            foodItemView = itemView.findViewById(R.id.textView)
        }
    }

    val mInflater: LayoutInflater
    private var mFoods
: List<Food?>? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val itemView = mInflater.inflate(R.layout.recyclerview_item, parent, false)
        return FoodViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int)
    {
        if (mFoods != null) {
            val current = mFoods!![position]
            var temp:Food? = mFoods!![position]
            holder.foodItemView.text = temp?.food
        } else { // Covers the case of data not being ready yet.
            holder.foodItemView.text = "No Food"
        }
    }

    fun setFoods(foods: List<Food?>?)
    {
        mFoods = foods
        notifyDataSetChanged()
    }


    override fun getItemCount(): Int
    {
        return if (mFoods != null) mFoods!!.size else 0
    }

    init {
        mInflater = LayoutInflater.from(context)
    }
}