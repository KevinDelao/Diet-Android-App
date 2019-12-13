package com.example.dietapp

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.example.dietapp.database.Record
import com.example.dietapp.databinding.RecordEntryBinding
import com.example.dietapp.recordsMVVM.RecordTrackerViewModel

class RecordEntryFragment: Fragment() {
    private lateinit var binding: RecordEntryBinding
    private var viewModel: RecordTrackerViewModel? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
        binding = DataBindingUtil.inflate<RecordEntryBinding>(
            inflater, R.layout.record_entry, container, false)
        viewModel = ViewModelProviders.of(this).get(RecordTrackerViewModel::class.java)
        binding.submitRecordButton.setOnClickListener { recordEntryListener(it) }
        binding.caloriesEditText.setOnClickListener { caloriesEditTextListener(it) }
        binding.weightEditText.setOnClickListener { weightEditTextListener(it) }
        return binding.root
    }
    private fun caloriesEditTextListener(view: View) {
        binding.caloriesEditText.requestFocus()
        val inputMethodManager = this.context?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }
    private fun weightEditTextListener(view: View) {
        binding.weightEditText.requestFocus()
        val inputMethodManager = this.context?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }
    private fun recordEntryListener(view: View) {
        var calories = binding.caloriesEditText.text.toString().toInt()
        var weight = binding.weightEditText.text.toString().toInt()
        val record = Record(null, calories, weight)
        viewModel!!.insert(record)
        val imm =
            activity!!.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        if (null != activity!!.currentFocus) imm.hideSoftInputFromWindow(
            activity!!.currentFocus!!
                .applicationWindowToken, 0
        )
        findNavController().navigate(RecordEntryFragmentDirections.recordEntryToRecordProgress())
    }
}