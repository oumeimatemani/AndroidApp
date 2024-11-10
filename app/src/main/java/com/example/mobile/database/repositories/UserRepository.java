package com.example.mobile.database.repositories;

import android.content.Context;

import com.example.mobile.DAO.UserDao;
import com.example.mobile.database.DatabaseProvider;
import com.example.mobile.database.EasyRideDatabase;
import com.example.mobile.database.UserEntity;

public class UserRepository {

    private UserDao userDao;

    public UserRepository(Context context) {
        EasyRideDatabase db = DatabaseProvider.getDatabase(context);
        userDao = db.userDao();
    }

    public UserEntity loginUser(String email, String password) {
        return userDao.loginUser(email, password);
    }
    public void insertuser(UserEntity user) {
         userDao.insertUser(user);
    }

    public UserEntity getUserByEmail(String email){
        return userDao.getUserByEmail(email);
    }
}