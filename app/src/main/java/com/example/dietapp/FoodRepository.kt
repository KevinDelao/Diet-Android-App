package com.example.dietapp


import android.app.Application
import androidx.lifecycle.LiveData


internal class FoodRepository(application: Application?) {
    private val mFoodDao: FoodDao

    val allFoods: LiveData<List<Food?>?>


    fun insert(food: Food?) {
        FoodRoomDatabase.databaseWriteExecutor.execute { mFoodDao.insert(food) }
    }

    fun delete()
    {
        FoodRoomDatabase.databaseWriteExecutor.execute{mFoodDao.deleteAll()}
    }



    init {
        val db = FoodRoomDatabase.getDatabase(application)
        mFoodDao = db.foodDao()
        allFoods = mFoodDao.alphabetizedFoods
    }
}