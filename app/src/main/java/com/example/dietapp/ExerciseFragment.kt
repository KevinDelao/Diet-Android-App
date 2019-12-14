package com.example.dietapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.dietapp.databinding.FragmentExerciseBinding

class ExerciseFragment : Fragment() {

    lateinit var keys_button : Button
    lateinit var tips_button : Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<FragmentExerciseBinding>(
            inflater, R.layout.fragment_exercise, container, false
        )

        keys_button = binding.button1
        tips_button = binding.button2

        keys_button.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_exerciseFragment_to_exercise2Fragment)
        }
        tips_button.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_exerciseFragment_to_exercise3TipsFragment)
        }

        return binding.root
    }
}