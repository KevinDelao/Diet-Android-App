package com.example.dietapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.dietapp.databinding.FragmentExercise2Binding

class Exercise2Fragment : Fragment() {

    lateinit var gotoHomeButton : Button
    lateinit var gotoCalorieButton : Button
    lateinit var gotoRecipeButton : Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<FragmentExercise2Binding>(
            inflater, R.layout.fragment_exercise2, container, false
        )

        gotoHomeButton = binding.homeButton
        gotoCalorieButton = binding.calorieButton
        gotoRecipeButton = binding.recipeButton

        gotoHomeButton.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_exercise2Fragment_to_titleFragment)
        }
        gotoCalorieButton.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_exercise2Fragment_to_calorieFragment)
        }
        gotoRecipeButton.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_exercise2Fragment_to_healthyRecipe)
        }

        return binding.root
    }
}


