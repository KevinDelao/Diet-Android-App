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
        FoodItems["Grilled Chicken"] = 90.0
        FoodItems["Egg"] = 60.0
        FoodItems["Apple"] = 40.0
        FoodItems["Orange"] = 100.0
        FoodItems["Pear"] = 70.0
        FoodItems["Mango"] = 150.0
        FoodItems["Banana"] = 105.0
        FoodItems["Tomato"] = 30.0
        FoodItems["Celery"] = 5.0
        FoodItems["Avocado"] = 250.0
        addFood = v.findViewById(R.id.addFoodButton);
        displayFood = v.findViewById<TextView>(R.id.displayFoodCalorie);
        addFood.setOnClickListener { calculateFood(it)}

        return v;
    }
    private fun InitialiazeFoodList(){
        FoodItems["Grilled Chicken"] = 90.0
        FoodItems["Egg"] = 60.0
        FoodItems["Apple"] = 40.0
        FoodItems["Orange"] = 100.0
        FoodItems["Pear"] = 70.0
        FoodItems["Mango"] = 150.0
        FoodItems["Banana"] = 105.0
        FoodItems["Tomato"] = 30.0
        FoodItems["Celery"] = 5.0
        FoodItems["Avocado"] = 250.0
    }
    private fun calculateFood(view: View)
    {
        foodEntry = v.findViewById<EditText>(R.id.foodEntryText);

        var food:String = foodEntry.text.toString();

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
