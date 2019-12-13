package com.example.dietapp


import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query


@Dao
interface FoodDao {
    @get:Query("SELECT * from food_table")
    val alphabetizedFoods: LiveData<List<Food?>?>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(food: Food?)

    @Query("DELETE FROM food_table")
    fun deleteAll()



}
