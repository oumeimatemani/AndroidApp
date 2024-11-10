package com.example.mobile.database;


import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.mobile.DAO.UserDao;

@Database(entities = {UserEntity.class, }, version = 4 )
public abstract class EasyRideDatabase extends RoomDatabase {
    public abstract UserDao userDao();
    //public abstract PlanFoodDao planFoodDao();
    // public abstract ServiceDao serviceDao();
    // public abstract FoodDao foodDao();
    // public abstract AnimalDao animalDao();
    //public abstract AppointmentDao appointmentDao();
}
