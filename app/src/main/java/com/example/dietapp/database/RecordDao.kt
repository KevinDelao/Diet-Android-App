package com.example.dietapp.database
import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface RecordDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(record: Record)

    @Update
    fun update(record: Record)

    @Query("SELECT * FROM records_table WHERE pk = :key")
    fun get(key: Long): Record?

    @Query("DELETE FROM records_table")
    fun clear()

    @Query("SELECT * FROM records_table ORDER BY pk DESC")
    fun getAllRecords(): LiveData<List<Record?>?>

    @Query("SELECT * FROM records_table ORDER BY pk DESC LIMIT 1")
    fun getTonight(): Record?
}