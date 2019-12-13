package com.example.dietapp


import android.os.Bundle
import android.text.Html
import android.text.method.LinkMovementMethod
import android.text.util.Linkify
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.dietapp.databinding.FragmentHealthyrecipeFoodDetailBinding
import com.example.dietapp.databinding.FragmentHealthyrecipeFoodMenuBinding
import android.content.Intent
import android.net.Uri


/**
 * A simple [Fragment] subclass.
 */
class HealthyRecipe_FoodDetail : Fragment() {

    lateinit var ingredient1 : TextView
    lateinit var ingredient2 : TextView
    lateinit var ingredient3 : TextView
    lateinit var ingredient4 : TextView
    lateinit var ingredient5 : TextView
    lateinit var ingredient6 : TextView
    lateinit var ingredient7 : TextView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentHealthyrecipeFoodDetailBinding>(
            inflater, R.layout.fragment_healthyrecipe_food_detail, container, false)
        ingredient1 = binding.shrimpIngredient1
        ingredient2 = binding.shrimpIngredient2
        ingredient3 = binding.shrimpIngredient3
        ingredient4 = binding.shrimpIngredient4
        ingredient5 = binding.shrimpIngredient5
        ingredient6 = binding.shrimpIngredient6
        ingredient7 = binding.shrimpIngredient7

        ingredient1.setOnClickListener(btn1)
        ingredient2.setOnClickListener(btn2)
        ingredient3.setOnClickListener(btn3)
        ingredient4.setOnClickListener(btn4)
        ingredient5.setOnClickListener(btn5)
        ingredient6.setOnClickListener(btn6)
        ingredient7.setOnClickListener(btn7)

        return binding.root
    }

    // Create an anonymous implementation of OnClickListener
    private val btn1 = View.OnClickListener {
        val uri = Uri.parse("https://www.amazon.com/Shrimp-Raised-Cooked-Previously-Frozen/dp/B079VJY7T4/ref=sr_1_6?almBrandId=VUZHIFdob2xlIEZvb2Rz&fpw=alm&keywords=1lb+raw+deveined+shrimp&qid=1576144465&sr=8-6") // missing 'http://' will cause crashed
        val intent = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent)
    }
    private val btn2 = View.OnClickListener {
        val uri = Uri.parse("https://www.amazon.com/Tourangelle-Avocado-All-Natural-Artisanal-Vegetables/dp/B006K3RCPC/ref=sr_1_1?almBrandId=VUZHIFdob2xlIEZvb2Rz&fpw=alm&keywords=avocado+oil&qid=1576144842&s=wholefoods&sr=1-1")
        val intent = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent)
    }

    private val btn3 = View.OnClickListener {
        val uri = Uri.parse("https://www.amazon.com/Frontier-Seasoning-Blends-Powder-2-08-Ounce/dp/B0001M10W4/ref=sr_1_1?almBrandId=VUZHIFdob2xlIEZvb2Rz&fpw=alm&keywords=chili+powder&qid=1576145032&s=wholefoods&sr=1-1")
        val intent = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent)
    }

    private val btn4 = View.OnClickListener {
        val uri = Uri.parse("https://www.amazon.com/Garlic-Organic-1-Each/dp/B0788FLWK1/ref=sr_1_2?almBrandId=VUZHIFdob2xlIEZvb2Rz&fpw=alm&keywords=garlic&qid=1576145120&s=wholefoods&sr=1-2")
        val intent = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent)
    }

    private val btn5 = View.OnClickListener {
        val uri = Uri.parse("https://www.amazon.com/Lemon-Regular-Organic-1-Each/dp/B079DSY3ZL/ref=sr_1_1?almBrandId=VUZHIFdob2xlIEZvb2Rz&fpw=alm&keywords=lemon&qid=1576145161&s=wholefoods&sr=1-1")
        val intent = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent)
    }

    private val btn6 = View.OnClickListener {
        val uri = Uri.parse("https://www.amazon.com/BALEINE-SEA-SALT-COURSE-26-5/dp/B0083PN1LO/ref=sr_1_4?almBrandId=VUZHIFdob2xlIEZvb2Rz&fpw=alm&keywords=salt&qid=1576145241&s=wholefoods&sr=1-4")
        val intent = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent)
    }

    private val btn7 = View.OnClickListener {
        val uri = Uri.parse("https://www.amazon.com/produce-aisle-mburring-Organic-Cilantro/dp/B000P6G0IK/ref=sr_1_2?almBrandId=VUZHIFdob2xlIEZvb2Rz&fpw=alm&keywords=chopped+fresh+cilantro&qid=1576145213&s=wholefoods&sr=1-2")
        val intent = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent)
    }


}
