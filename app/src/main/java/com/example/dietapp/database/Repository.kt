package com.example.dietapp.database
import android.app.Application
import androidx.lifecycle.LiveData
class Repository(application: Application?){
    private val rRecordDao: RecordDao
    val records: LiveData<List<Record?>?>
    fun insert(record: Record) {
        RecordRoomDatabase.databaseWriteExecutor.execute { rRecordDao.insert(record) }
    }
    fun clear() {
        RecordRoomDatabase.databaseWriteExecutor.execute { rRecordDao.clear() }
    }
    init {
        val db = RecordRoomDatabase.getDatabase(application)
        rRecordDao = db.recordDao()
        records = rRecordDao.getAllRecords()
    }
}