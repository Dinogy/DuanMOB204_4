package com.example.duanmob204;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.google.android.material.textfield.TextInputEditText;

public class LoginScreenActivity extends AppCompatActivity {
TextInputEditText username,password;
CheckBox ckbremember;
Button btnlogin,btncancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen2);
        btnlogin=findViewById(R.id.btnlogin);
        btncancel=findViewById(R.id.btncancel);
        ckbremember=findViewById(R.id.ckbrememberme);
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginScreenActivity.this,HomeScreenActivity.class));
            }
        });
    }
}