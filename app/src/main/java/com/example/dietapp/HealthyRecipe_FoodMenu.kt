package com.example.dietapp


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.dietapp.databinding.FragmentHealthyrecipeBinding
import com.example.dietapp.databinding.FragmentHealthyrecipeFoodMenuBinding
import kotlinx.android.synthetic.main.fragment_healthyrecipe_food_menu.view.*

/**
 * A simple [Fragment] subclass.
 */
class HealthyRecipe_FoodMenu : Fragment() {

    lateinit var view_recipe_button : Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentHealthyrecipeFoodMenuBinding>(
            inflater, R.layout.fragment_healthyrecipe_food_menu, container, false)

        view_recipe_button = binding.viewRecipe
        view_recipe_button.setOnClickListener{ view : View ->
            view.findNavController().navigate(R.id.action_healthyRecipe_FoodMenu_to_healthyRecipe_FoodDetail)
        }

        return binding.root
    }



}
