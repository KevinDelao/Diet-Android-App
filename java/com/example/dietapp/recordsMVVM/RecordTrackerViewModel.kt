package com.example.dietapp.recordsMVVM
import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.dietapp.database.Record
import com.example.dietapp.database.Repository

class RecordTrackerViewModel(application: Application): AndroidViewModel(application!!) {
    private val rRepository: Repository
    val recordItems: LiveData<List<Record?>?>
    fun insert(record: Record) {
        rRepository.insert(record)
    }
    fun clear() {
        rRepository.clear()
    }
    init {
        rRepository = Repository(application)
        recordItems = rRepository.records
    }

}