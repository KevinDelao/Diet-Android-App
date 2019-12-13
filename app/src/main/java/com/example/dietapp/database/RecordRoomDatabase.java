package com.example.dietapp.database;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import android.content.Context;
import androidx.annotation.NonNull;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
@Database(entities = {Record.class}, version = 2, exportSchema = false)
abstract class RecordRoomDatabase extends RoomDatabase {

    abstract RecordDao recordDao();

    private static volatile RecordRoomDatabase INSTANCE;
    private static final int NUMBER_OF_THREADS = 4;
    static final ExecutorService databaseWriteExecutor =
            Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    static RecordRoomDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (RecordRoomDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            RecordRoomDatabase.class, "record_database")
                            .addCallback(sRoomDatabaseCallback)
                            .fallbackToDestructiveMigration()
                            .build();
                }
            }
        }
        return INSTANCE;
    }

    private static RoomDatabase.Callback sRoomDatabaseCallback = new RoomDatabase.Callback() {
        @Override
        public void onOpen(@NonNull SupportSQLiteDatabase db) {
            super.onOpen(db);


            databaseWriteExecutor.execute(() -> {

                RecordDao dao = INSTANCE.recordDao();
                dao.clear();

                Record record = new Record(null, 1400, 140);
                dao.insert(record);
                record = new Record(null, 1500, 140);
                dao.insert(record);
            });
        }
    };
}