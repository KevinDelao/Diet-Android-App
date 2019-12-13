package com.example.dietapp.database
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey



@Entity(tableName = "records_table")
data class Record (
    @PrimaryKey(autoGenerate = true) val pk: Int? = null,
    @ColumnInfo(name = "calories") val calories: Int,
    @ColumnInfo(name = "weight") val weight: Int
)