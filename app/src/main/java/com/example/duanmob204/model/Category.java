package com.example.duanmob204.model;

public class Category {
    String CategoryName;
    String Categorylocation;
    String Description;

    public Category() {
    }

    public Category(String categoryName, String categorylocation, String description) {
        CategoryName = categoryName;
        Categorylocation = categorylocation;
        Description = description;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }

    public String getCategorylocation() {
        return Categorylocation;
    }

    public void setCategorylocation(String categorylocation) {
        Categorylocation = categorylocation;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    @Override
    public String toString() {
        return "Category{" +
                "CategoryName='" + CategoryName + '\'' +
                ", Categorylocation='" + Categorylocation + '\'' +
                ", Description='" + Description + '\'' +
                '}';
    }
}
