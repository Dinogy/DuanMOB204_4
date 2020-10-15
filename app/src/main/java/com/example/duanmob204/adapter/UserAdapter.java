package com.example.duanmob204.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.example.duanmob204.DAO.UserDAO;
import com.example.duanmob204.R;
import com.example.duanmob204.database.MySqlite;
import com.example.duanmob204.model.User;

import java.util.List;

public class UserAdapter  extends BaseAdapter {

    public    UserAdapter(List<User> userList){this.userList=userList;}
private List<User> userList;
    @Override
    public int getCount() {
        return userList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(final int i, View view,final ViewGroup viewGroup) {
        view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.user_adapter,
                viewGroup, false);

        TextView tvName = view.findViewById(R.id.txtName);
        tvName.setText("UserName: "+userList.get(i).username + " - " +"FullName: "+ userList.get(i).firstandlastname);
        TextView tvPhoneNumber=view.findViewById(R.id.txtPhonenumber);
        tvPhoneNumber.setText("PhoneNumber: "+userList.get(i).phonenumber);

        view.findViewById(R.id.imgdelete).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                UserDAO userDAO = new UserDAO(new MySqlite(viewGroup.getContext()));
                String username = userList.get(i).username;
                boolean ketQua = userDAO.delUser(username);
                if (ketQua) {
                    Toast.makeText(viewGroup.getContext(), "Xoa Thanh Cong!!!",
                            Toast.LENGTH_SHORT).show();

                    userList.remove(i);
                    notifyDataSetChanged();

                } else {
                    Toast.makeText(viewGroup.getContext(), "Xoa KHONG Thanh Cong!!!",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
        return view;
    }
}
