package com.example.dietapp


import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData


class FoodViewModel(application: Application?) : AndroidViewModel(application!!)
{
    private val mRepository: FoodRepository

    val allWords: LiveData<List<Food?>?>?

    fun insert(food: Food?) {
        mRepository.insert(food)
    }

    init {
        mRepository = FoodRepository(application)
        allWords = mRepository.allFoods
    }
}