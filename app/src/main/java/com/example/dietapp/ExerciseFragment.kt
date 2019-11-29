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

class ExerciseFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_exercise, container, false)

        val gotoExercise2Button : Button = root.findViewById(R.id.button1)
        gotoExercise2Button.setOnClickListener {
            handleGotoExercise2(it)
        }

        return root
    }

    private fun handleGotoExercise2(view: View) {

        view.findNavController().navigate(R.id.action_exerciseFragment_to_exercise2Fragment)
    }

}