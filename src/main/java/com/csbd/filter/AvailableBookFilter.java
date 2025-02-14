package com.csbd.filter;

import com.csbd.model.Book;

public class AvailableBookFilter implements BookFilter{
    @Override
    public boolean apply(Book book) {
        return !book.isCheckOut();
    }
}
