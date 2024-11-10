package com.example.mobile.database;
import android.content.Context;
import androidx.room.Room;

public class DatabaseProvider {
    private static volatile EasyRideDatabase INSTANCE;

    public static EasyRideDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (EasyRideDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                                    EasyRideDatabase.class, "easyRide_database")
                            .fallbackToDestructiveMigration()
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}
