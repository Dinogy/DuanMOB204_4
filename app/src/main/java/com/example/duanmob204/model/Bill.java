package com.example.duanmob204.model;

import java.util.Date;

public class Bill {
    String DateOfPurchases;

    public Bill() {
    }

    public Bill(String dateOfPurchases) {
        DateOfPurchases = dateOfPurchases;
    }

    public String getDateOfPurchases() {
        return DateOfPurchases;
    }


    public void setDateOfPurchases(String dateOfPurchases) {
        DateOfPurchases = dateOfPurchases;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "DateOfPurchases='" + DateOfPurchases + '\'' +
                '}';
    }
}
