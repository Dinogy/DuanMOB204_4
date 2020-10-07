package com.example.duanmob204.model;

public class Book {
    String BookName;
    String Author;
    int Amount;
    String Bookdescription;
    int Category;

    public Book() {
    }

    public Book(String bookName, String author, int amount, String bookdescription, int category) {
        BookName = bookName;
        Author = author;
        Amount = amount;
        Bookdescription = bookdescription;
        Category = category;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int amount) {
        Amount = amount;
    }

    public String getBookdescription() {
        return Bookdescription;
    }

    public void setBookdescription(String bookdescription) {
        Bookdescription = bookdescription;
    }

    public int getCategory() {
        return Category;
    }

    public void setCategory(int category) {
        Category = category;
    }

    @Override
    public String toString() {
        return "Book{" +
                "BookName='" + BookName + '\'' +
                ", Author='" + Author + '\'' +
                ", Amount=" + Amount +
                ", Bookdescription='" + Bookdescription + '\'' +
                ", Category=" + Category +
                '}';
    }
}
