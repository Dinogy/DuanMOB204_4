package com.example.duanmob204.model;

public class User {
    String Username;
    String Password;
    int Phonenumber;
    String FirstAndLastName;
    String Email;

    public User() {
    }

    public User(String username, String password, int phonenumber, String firstAndLastName, String email) {
        Username = username;
        Password = password;
        Phonenumber = phonenumber;
        FirstAndLastName = firstAndLastName;
        Email = email;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public int getPhonenumber() {
        return Phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        Phonenumber = phonenumber;
    }

    public String getFirstAndLastName() {
        return FirstAndLastName;
    }

    public void setFirstAndLastName(String firstAndLastName) {
        FirstAndLastName = firstAndLastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "Username='" + Username + '\'' +
                ", Password='" + Password + '\'' +
                ", Phonenumber=" + Phonenumber +
                ", FirstAndLastName='" + FirstAndLastName + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }
}
