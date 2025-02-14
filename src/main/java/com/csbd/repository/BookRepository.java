package com.csbd.repository;

import com.csbd.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book){
        this.books.add(book);
    }

    public List<Book> getAllBook(){
        return books;
    }
}
