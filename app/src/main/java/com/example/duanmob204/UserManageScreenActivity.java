package com.example.duanmob204;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.duanmob204.DAO.UserDAO;
import com.example.duanmob204.database.MySqlite;
import com.example.duanmob204.model.User;

import java.util.List;

public class UserManageScreenActivity extends AppCompatActivity {
    ListView listView;
    MySqlite mySqlite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_manage_screen2);
        listView = findViewById(R.id.lvuser);
        mySqlite = new MySqlite(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.add,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.add) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            View view = LayoutInflater.from(this).inflate(R.layout.add_user_dialog, null);
            builder.setView(view);

            final EditText edusername = view.findViewById(R.id.edusername);
            final EditText edpassword = view.findViewById(R.id.edpassword);
            final EditText edphonenumber = view.findViewById(R.id.edphonenumber);
            final EditText edfirstandlastname = view.findViewById(R.id.edfirstandlastname);
            final EditText edemail = view.findViewById(R.id.edemail);
            Button btnadd = view.findViewById(R.id.btnadd);
            Button btncancel = view.findViewById(R.id.btncancel);
            final AlertDialog alertDialog = builder.show();
            btnadd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    User user=new User();
                    user.getUsername()= edusername.getText().toString().trim();
                    nguoiDung.ten = editTextTextPersonName6.getText().toString().trim();
                    nguoiDung.password = editTextTextPassword.getText().toString().trim();
                    nguoiDung.sdt = editTextPhone.getText().toString().trim();



                    UserDAO userDAO = new UserDAO(mySqlite);

                    boolean ketQua = userDAO.addUser(nguoiDung);
                    if (ketQua) {
                        Toast.makeText(UserManageScreenActivity.this,
                                "THANH CONG!!!", Toast.LENGTH_SHORT).show();
                        alertDialog.dismiss();

                        List<User> nguoiDungList = userDAO.getAllUsers();
                        NguoiDungAdapter nguoiDungAdapter = new NguoiDungAdapter(nguoiDungList);
                        listView.setAdapter(nguoiDungAdapter);
                    } else {
                        Toast.makeText(QLNguoiDungActivity.this,
                                "KHONG THANH CONG!!!", Toast.LENGTH_SHORT).show();
                    }

                }
            });


            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    alertDialog.dismiss();
                }
            });
        }
        return super.onOptionsItemSelected(item);
    }
}