package com.example.dietapp


import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import lecho.lib.hellocharts.model.PieChartData
import lecho.lib.hellocharts.model.SliceValue
import lecho.lib.hellocharts.view.PieChartView



class FoodOverViewFragment : Fragment() {

    var pieChartView: PieChartView? = null
    lateinit var v:View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?
    {

        v = inflater.inflate(R.layout.food_overview, container, false);
        pieChartView = v.findViewById(R.id.calorie_chart);
        val pieData: MutableList<SliceValue> = ArrayList()
        
        pieData.add(SliceValue(40.toFloat(), Color.BLUE).setLabel("Calories Used"))

        pieData.add(SliceValue(60.toFloat(), Color.MAGENTA).setLabel("Calorie Budget Left"))

        val pieChartData = PieChartData(pieData)
        pieChartData.setHasLabels(true).valueLabelTextSize = 14
        pieChartData.setHasCenterCircle(true).setCenterText1("Calories Consumed")
            .setCenterText1FontSize(20).centerText1Color = Color.parseColor("#0097A7")
        pieChartView!!.setPieChartData(pieChartData)
        return v

    }
}



