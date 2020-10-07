package com.example.duanmob204.DAO;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import com.example.duanmob204.database.MySqlite;
import com.example.duanmob204.model.User;

public class UserDAO {
    private MySqlite mySqlite;

    public UserDAO(MySqlite mySqlite) {
        this.mySqlite = mySqlite;
    }
    public boolean addUser(User user) {
        // xin quyen 1
        SQLiteDatabase sqLiteDatabase = mySqlite.getWritableDatabase();
        // ghép cặp giá trị vào tên cột 2
        ContentValues contentValues = new ContentValues();
        contentValues.put("username", user.getUsername());
        contentValues.put("password", user.getPassword());
        contentValues.put("phonenumber", user.getPhonenumber());
        contentValues.put("firstandlastname", user.getFirstAndLastName());
        contentValues.put("email", user.getEmail());
        // truy vấn 3
        long kq = sqLiteDatabase.insert("USER", null, contentValues);

        if (kq > 0) return true;
        else return false;

    }
}
