package com.technodoughnuttt.src.main.java.models;

public class Book {
    private String name;
    private int bookScore;

    public Book(String name, int bookScore) {
        this.name = name;
        this.bookScore = bookScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBookScore() {
        return bookScore;
    }

    public void setBookScore(int bookScore) {
        this.bookScore = bookScore;
    }
}
