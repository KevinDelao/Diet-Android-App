package com.example.dietapp


import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData


class FoodViewModel(application: Application?) : AndroidViewModel(application!!)
{
    private val mRepository: FoodRepository

    val allFoods: LiveData<List<Food?>?>?

    fun insert(food: Food?) {
        mRepository.insert(food)
    }

    fun delete(){
        mRepository.delete();
    }


    init {
        mRepository = FoodRepository(application)
        allFoods = mRepository.allFoods
    }
}