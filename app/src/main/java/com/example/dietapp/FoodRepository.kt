package com.example.dietapp


import android.app.Application
import androidx.lifecycle.LiveData


internal class FoodRepository(application: Application?) {
    private val mWordDao: FoodDao

    val allFoods: LiveData<List<Food?>?>


    fun insert(food: Food?) {
        FoodRoomDatabase.databaseWriteExecutor.execute { mWordDao.insert(food) }
    }


    init {
        val db = FoodRoomDatabase.getDatabase(application)
        mWordDao = db.foodDao()
        allFoods = mWordDao.alphabetizedFoods
    }
}