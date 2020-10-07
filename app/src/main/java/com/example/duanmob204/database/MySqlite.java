package com.example.duanmob204.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MySqlite extends SQLiteOpenHelper {
    public MySqlite(Context context) {
        super(context, "mydata.sql", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String user_table = "CREATE TABLE USER (username char(15) primary key" +
                ",password varchar" +
                ",phonenumber char,firstandlastname varchar(50),email char(15))";
        sqLiteDatabase.execSQL(user_table);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
