package com.example.dietapp;




import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import android.content.Context;
import androidx.annotation.NonNull;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


@Database(entities = {Food.class}, version = 1, exportSchema = false)
abstract class FoodRoomDatabase extends RoomDatabase {

    abstract FoodDao foodDao();

    private static volatile FoodRoomDatabase INSTANCE;
    private static final int NUMBER_OF_THREADS = 4;
    static final ExecutorService databaseWriteExecutor =
            Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    static FoodRoomDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (FoodRoomDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            FoodRoomDatabase.class, "food_database")
                            .addCallback(sRoomDatabaseCallback)
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

                FoodDao dao = INSTANCE.foodDao();
                dao.deleteAll();

                Food food = new Food("Apple: 100 calories");
                dao.insert(food);
                food = new Food("Orange: 60 calories");
                dao.insert(food);
            });
        }
    };
}
