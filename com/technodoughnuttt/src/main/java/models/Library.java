package com.technodoughnuttt.src.main.java.models;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private String name;
    private List<Book> books = new ArrayList<>();
    private int booksShippedPerDay;
    private int signUpProcessInDays;

    public Library(String name, List<Book> books, int booksShippedPerDay, int signUpProcessInDays) {
        this.name = name;
        this.books = books;
        this.booksShippedPerDay = booksShippedPerDay;
        this.signUpProcessInDays = signUpProcessInDays;
    }

    public int getSignUpProcessInDays() {
        return signUpProcessInDays;
    }

    public void setSignUpProcessInDays(int signUpProcessInDays) {
        this.signUpProcessInDays = signUpProcessInDays;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public int getBooksShippedPerDay() {
        return booksShippedPerDay;
    }

    public void setBooksShippedPerDay(int booksShippedPerDay) {
        this.booksShippedPerDay = booksShippedPerDay;
    }
}
