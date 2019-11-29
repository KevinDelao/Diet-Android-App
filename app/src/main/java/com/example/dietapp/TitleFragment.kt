package com.example.dietapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.findNavController

class TitleFragment : Fragment()
{
    lateinit var viewTitle:View;
    lateinit var toCaloriePage: Button
    lateinit var toHealthyRecipe: Button
    lateinit var toExercise: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewTitle = inflater.inflate(R.layout.fragment_title,container,false)

        toCaloriePage = viewTitle.findViewById(R.id.title_page_calorie_counter_button)
        toHealthyRecipe = viewTitle.findViewById(R.id.title_page_healthy_recipes_button)
        toExercise = viewTitle.findViewById(R.id.title_page_exercise_button)


        toCaloriePage.setOnClickListener{ view : View ->
            view.findNavController().navigate(R.id.action_titleFragment_to_calorieFragment)
        }

        //my part
        toHealthyRecipe.setOnClickListener{ view : View ->
            view.findNavController().navigate(R.id.action_titleFragment_to_healthyRecipe)
        }

        toExercise.setOnClickListener{ view : View ->
            view.findNavController().navigate(R.id.action_titleFragment_to_exerciseFragment)
        }

        return viewTitle
        }
}



