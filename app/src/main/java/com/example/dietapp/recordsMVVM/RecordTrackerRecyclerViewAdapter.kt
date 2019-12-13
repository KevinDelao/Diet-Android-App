package com.example.dietapp.recordsMVVM
import android.content.Context
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dietapp.R
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import com.example.dietapp.database.Record
import kotlinx.android.synthetic.main.record_card.view.*

class RecordTrackerRecyclerViewAdapter internal constructor(context: Context?) : RecyclerView.Adapter<RecordTrackerRecyclerViewAdapter.RecordViewHolder>() {
    val inflater: LayoutInflater
    private var records: List<Record?>? = null
    inner class RecordViewHolder constructor(recordView: View): RecyclerView.ViewHolder(recordView) {
        val calories: TextView
        val weight: TextView
        val date: TextView
        init {
            calories = itemView.findViewById(R.id.recordCalories)
            weight = itemView.findViewById(R.id.recordWeight)
            date = itemView.findViewById(R.id.recordDate)
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecordViewHolder {
        val itemView = inflater.inflate(R.layout.record_card, parent, false)
        return RecordViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: RecordViewHolder, position: Int) {
        if (records != null) {
            val current = records!![position]
            var temp:Record? = records!![position]
            holder.calories.text = temp?.calories.toString()
            holder.weight.text = temp?.weight.toString()
            val time = LocalDateTime.now()
            val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")
            holder.date.text = formatter.format(time)
        } else {
            holder.calories.text = "No Records"
        }
    }
    override fun getItemCount(): Int {
        if(records != null) {
            return records!!.size
        } else {
            return 0
        }
    }
    fun setRecords(recordList: List<Record?>?) {
        records = recordList
        notifyDataSetChanged()
    }
    init {
        inflater = LayoutInflater.from(context)
    }
}
/*
inner class RecordViewHolder constructor(recordView: View): RecyclerView.ViewHolder(recordView) {
        val weight = itemView.recordWeight
        val calories = itemView.recordCalories
        val date = itemView.recordDate
        fun bind(recordPost: Record) {
            weight.setText(recordPost.weight)
            calories.setText(recordPost.calories)
            val current = LocalDateTime.now()
            val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")
            date.setText(current.format(formatter))
        }
}
*/