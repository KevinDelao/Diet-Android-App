package com.example.dietapp


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.dietapp.databinding.FragmentHealthyrecipeBinding

/**
 * A simple [Fragment] subclass.
 */
class HealthyRecipe : Fragment() {

    lateinit var img1 : ImageView
    lateinit var img2 : ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentHealthyrecipeBinding>(
            inflater, R.layout.fragment_healthyrecipe, container, false)

        img1 = binding.food
        img2 = binding.drink



        return binding.root
    }

}
