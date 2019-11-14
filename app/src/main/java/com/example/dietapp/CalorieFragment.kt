package com.example.dietapp


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView


class CalorieFragment : Fragment() {
    lateinit var v:View;
    lateinit var addFood:Button;
    lateinit var displayFood:TextView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?
    {
        v = inflater.inflate(R.layout.calorie_layout,container,false);
        addFood = v.findViewById(R.id.addFoodButton);
        displayFood = v.findViewById(R.id.displayFoodCalorie);
        addFood.setOnClickListener { calculateFood(it)}

        return v;
    }
    private fun calculateFood(view: View)
    {
        displayFood.visibility = View.VISIBLE;

    }

}
