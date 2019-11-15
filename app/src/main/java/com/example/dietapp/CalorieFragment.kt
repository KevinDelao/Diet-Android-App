package com.example.dietapp


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class CalorieFragment : Fragment() {
    lateinit var v:View;
    lateinit var addFood:Button;
    lateinit var displayFood:TextView
    lateinit var foodEntry:EditText
    lateinit var calorieDisplay:String;
    var FoodItems = HashMap<String, Double>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?
    {
        v = inflater.inflate(R.layout.calorie_layout,container,false);
        InitialiazeFoodList();
        addFood = v.findViewById(R.id.addFoodButton);
        displayFood = v.findViewById<TextView>(R.id.displayFoodCalorie);
        addFood.setOnClickListener { calculateFood(it)}

        return v;
    }
    private fun InitialiazeFoodList(){
        FoodItems["GRILLED CHICKEN"] = 90.0
        FoodItems["EGG"] = 60.0
        FoodItems["APPLE"] = 40.0
        FoodItems["ORANGE"] = 100.0
        FoodItems["PEAR"] = 70.0
        FoodItems["MANGO"] = 150.0
        FoodItems["BANANA"] = 105.0
        FoodItems["TOMATO"] = 30.0
        FoodItems["CELERY"] = 5.0
        FoodItems["AVOCADO"] = 250.0
    }
    private fun calculateFood(view: View)
    {
        foodEntry = v.findViewById<EditText>(R.id.foodEntryText);

            var food:String = foodEntry.text.toString();
            food = food.toUpperCase();
            if( FoodItems.containsKey(food))
            {
                calorieDisplay = food+" has "+FoodItems[food].toString()+" calories";
            }
            else{
                calorieDisplay = "Food Not in List"
            }


        displayFood.text = calorieDisplay;
        displayFood.visibility = View.VISIBLE;

    }

}
