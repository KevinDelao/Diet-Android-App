package com.example.dietapp.recordsMVVM
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dietapp.R
import com.example.dietapp.databinding.RecordProgressBinding

class RecordTrackerFragment : Fragment() {
    private lateinit var binding: RecordProgressBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate<RecordProgressBinding>(
            inflater, R.layout.record_progress, container, false)
        val adapter = RecordTrackerRecyclerViewAdapter(activity)
        binding.recordRecyclerView.adapter = adapter
        binding.recordRecyclerView.layoutManager = LinearLayoutManager(activity)
        val topSpacingDecoration = TopSpacingItemDecoration(30)
        binding.recordRecyclerView.apply { addItemDecoration(topSpacingDecoration) }
        val viewModel = ViewModelProviders.of(this).get(RecordTrackerViewModel::class.java)
        viewModel.recordItems.observe(this, Observer { records ->
            adapter.setRecords(records)
        })
        binding.recordProgressButton.setOnClickListener { recordProgressListener(it) }
        return binding.root
    }
    /*private fun addDataSet() {
        val data = RecordDatabase.getInstance(this.context)
        recordAdapter.submitList(data)
    }
    private fun initRecyclerView() {
        recordRecyclerView.apply {
            layoutManager = LinearLayoutManager(this.context)
            recordAdapter = RecordTrackerRecyclerViewAdapter()
            adapter = recordAdapter
        }
    }*/
    private fun recordProgressListener(view: View) {
        view.findNavController().navigate(RecordTrackerFragmentDirections.recordProgressToRecordEntry())
    }
}
/*
viewModel.recordItems.observe(this, Observer {
            it?.let{
                adapter.submitList(it)
            }
})
*/