package com.example.duanmob204.DAO;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.duanmob204.database.MySqlite;
import com.example.duanmob204.model.User;

import java.util.ArrayList;
import java.util.List;

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
        contentValues.put("username", user.username);
        contentValues.put("password", user.password);
        contentValues.put("phonenumber", user.phonenumber);
        contentValues.put("firstandlastname", user.firstandlastname);
        contentValues.put("email", user.email);

        // truy vấn 3
        long kq = sqLiteDatabase.insert("USER", null, contentValues);

        if (kq > 0) return true;
        else return false;

    }

    // del
    public boolean delUser(String username) {
        // xin quyen 1
        SQLiteDatabase sqLiteDatabase = mySqlite.getWritableDatabase();

        // truy vấn 3
        long kq = sqLiteDatabase.delete("USER", "username=?",
                new String[]{username});

        if (kq > 0) return true;
        else return false;

    }

    // get all

    public List<User> getAllUsers() {
        List<User> nguoiDungList = new ArrayList<>();
        String sql = "SELECT * FROM USER";
        Cursor cursor = mySqlite.getReadableDatabase().rawQuery(sql, null);
        if (cursor.getCount() > 0) {
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                String username = cursor.getString(0);
                String password = cursor.getString(1);
                String phonenumber = cursor.getString(2);
                String firstandlastname = cursor.getString(3);
                String email = cursor.getString(4);

                User user = new User();
                user.username = username;
                user.password = password;
                user.phonenumber = phonenumber;
                user.firstandlastname = firstandlastname;
                user.email = email;

                nguoiDungList.add(user);
                cursor.moveToNext();
            }
        }

        return nguoiDungList;
    }

}
