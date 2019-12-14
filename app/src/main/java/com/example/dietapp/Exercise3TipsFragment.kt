package com.example.dietapp

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import androidx.databinding.DataBindingUtil
import com.example.dietapp.databinding.FragmentExercise3TipsBinding

class Exercise3TipsFragment : Fragment() {

    lateinit var gotoHomeButton : Button
    lateinit var gotoCalorieButton : Button
    lateinit var gotoRecipeButton : Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<FragmentExercise3TipsBinding>(
            inflater, R.layout.fragment_exercise3_tips, container, false
        )

        gotoHomeButton = binding.homeButton
        gotoCalorieButton = binding.calorieButton
        gotoRecipeButton = binding.recipeButton

        gotoHomeButton.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_exercise3TipsFragment_to_titleFragment)
        }
        gotoCalorieButton.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_exercise3TipsFragment_to_calorieFragment)
        }
        gotoRecipeButton.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_exercise3TipsFragment_to_healthyRecipe)
        }

        return binding.root
    }
}