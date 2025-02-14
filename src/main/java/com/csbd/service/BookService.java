package com.csbd.service;

import com.csbd.filter.BookFilter;
import com.csbd.model.Book;
import com.csbd.repository.BookRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

    public List<Book> getFilteredBooks(BookFilter filter) {
        return bookRepository.getAllBook().stream().filter(filter::apply).collect(Collectors.toList());
    }
}
