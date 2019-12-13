package com.example.dietapp


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.databinding.DataBindingUtil
import com.example.dietapp.databinding.FragmentHealthyrecipeOrangeDrinkBinding

/**
 * A simple [Fragment] subclass.
 */
class HealthyRecipe_OrangeDrink : Fragment() {
    lateinit var orange_juice_picture : ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentHealthyrecipeOrangeDrinkBinding>(
            inflater, R.layout.fragment_healthyrecipe_orange_drink, container, false)
        orange_juice_picture = binding.OrangeJuice
        orange_juice_picture.setOnClickListener(btn1)
        return binding.root
    }

    // Create an anonymous implementation of OnClickListener
    private val btn1 = View.OnClickListener {
        val uri = Uri.parse("https://www.amazon.com/365-Everyday-Value-Florida-Concentrate/dp/B074J67WLX/ref=sr_1_1?almBrandId=VUZHIFdob2xlIEZvb2Rz&fpw=alm&keywords=orange+juice&qid=1576147764&s=wholefoods&sr=1-1") // missing 'http://' will cause crashed
        val intent = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent)
    }
}
