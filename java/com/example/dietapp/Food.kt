package com.example.dietapp


import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "food_table")
class Food(@field:ColumnInfo(name = "food") @field:PrimaryKey var food: String)


