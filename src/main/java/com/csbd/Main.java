package com.csbd;

import com.csbd.filter.AvailableBookFilter;
import com.csbd.model.Book;
import com.csbd.model.EBook;
import com.csbd.model.PhysicalBook;
import com.csbd.notification.EmailNotification;
import com.csbd.repository.BookRepository;
import com.csbd.service.BookService;
import com.csbd.service.LibraryService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BookRepository repository = new BookRepository();
        Book physicalBook = new PhysicalBook("Clean Code", "Robert C. Martin");
        repository.addBook(physicalBook);
        repository.addBook(new EBook("Java Concurrency", "Brian Goetz", "http://download.com/java"));

        physicalBook.checkOut();

        BookService service = new BookService(repository);
        List<Book> availableBooks = service.getFilteredBooks(new AvailableBookFilter());


        System.out.println("Available books:");
        for (Book book : availableBooks) {
            System.out.println(book.getTitle());
        }

        LibraryService library = new LibraryService(new EmailNotification());
        library.notifyUsers("Your book is due soon!");
    }
}