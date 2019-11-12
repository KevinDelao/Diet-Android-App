package com.example.dietapp
import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.dietapp.R
import com.example.dietapp.databinding.FragmentTitleBinding

class TitleFragment : Fragment() {
    private lateinit var binding: FragmentTitleBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate<FragmentTitleBinding>(
            inflater, R.layout.fragment_title, container, false)
        binding.titlePage
        binding.titlePageCalorieCounterButton.setOnClickListener { calorieCounterClickListener(it) }
        binding.titlePageHealthyRecipesButton.setOnClickListener { healthyRecipesClickListener(it) }
        binding.titlePageWeightProgressButton.setOnClickListener { weightProgressClickListener(it) }
        binding.titlePageNutritionButton.setOnClickListener { nutritionClickListener(it) }
        binding.titlePageExerciseButton.setOnClickListener { exerciseClickListener(it) }
        binding.titlePageGoalsButton.setOnClickListener { goalsClickListener(it) }
        return binding.root
    }
    private fun calorieCounterClickListener(view: View) {
        //view.findNavController().navigate(FragmentTitleDirections.xxxxxxxxxxxxxxx)
    }
    private fun healthyRecipesClickListener(view: View) {
        //view.findNavController().navigate(FragmentTitleDirections.xxxxxxxxxxxxxxx)
    }
    private fun weightProgressClickListener(view: View) {
        //view.findNavController().navigate(FragmentTitleDirections.xxxxxxxxxxxxxxx)
    }
    private fun nutritionClickListener(view: View) {
        //view.findNavController().navigate(FragmentTitleDirections.xxxxxxxxxxxxxxx)
    }
    private fun exerciseClickListener(view: View) {
        //view.findNavController().navigate(FragmentTitleDirections.xxxxxxxxxxxxxxx)
    }
    private fun goalsClickListener(view: View) {
        //view.findNavController().navigate(FragmentTitleDirections.xxxxxxxxxxxxxxx)
    }
}