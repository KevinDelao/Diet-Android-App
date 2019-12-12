
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dietapp.*


class CalorieFragment : Fragment() {
    lateinit var v: View;
    private var mFoodViewModel: FoodViewModel? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.calorie_layout, container, false);
        val recyclerView = v.findViewById<RecyclerView>(R.id.recyclerview)
        val adapter = FoodListAdapter(activity)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(activity)

        mFoodViewModel = ViewModelProviders.of(this).get(FoodViewModel::class.java)

        mFoodViewModel!!.allWords?.observe(this, Observer { foods ->
            adapter.setWords(foods)
        })
        val newFood = v.findViewById<Button>(R.id.newfood_button)
        newFood.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_calorieFragment_to_addFoodFragment2)
        }
        return v;

    }
}
