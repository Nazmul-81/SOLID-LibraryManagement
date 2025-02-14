package com.csbd.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Book {
    private String title;
    private String author;
    private boolean isCheckOut;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void checkOut(){
        this.isCheckOut = true;
    }

    public void returnBook(){
        this.isCheckOut = false;
    }
}
