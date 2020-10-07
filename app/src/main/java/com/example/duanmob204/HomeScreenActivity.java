package com.example.duanmob204;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class HomeScreenActivity extends AppCompatActivity {
    ImageView imguser, imgbookmanage, imgbook, imgbill, imgbestseller, imgcategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen2);
        imguser = findViewById(R.id.imageuser);
        imgbookmanage = findViewById(R.id.imgbookmanage);
        imgbook = findViewById(R.id.imgbook);
        imgbill = findViewById(R.id.imgbill);
        imgbestseller = findViewById(R.id.imgbestseller);
        imgcategory = findViewById(R.id.imgcategory);

    }
}