package com.csbd.model;

public class PhysicalBook extends Book implements Borrowable, Returnable{

    public PhysicalBook(String title, String author) {
        super(title, author);
    }

    @Override
    public void borrow() {
        checkOut();
    }

    @Override
    public void returnBook() {
        super.returnBook();
    }
}
