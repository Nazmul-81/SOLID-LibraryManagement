package com.csbd.filter;

import com.csbd.model.Book;

public interface BookFilter {
    boolean apply(Book book);
}
