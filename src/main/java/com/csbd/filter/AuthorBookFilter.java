package com.csbd.filter;

import com.csbd.model.Book;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AuthorBookFilter implements BookFilter {

    final String bookAuthor;

    @Override
    public boolean apply(Book book) {
        return book.getAuthor().equalsIgnoreCase(bookAuthor);
    }
}
