package com.csbd.model;

import lombok.Getter;

@Getter
public class EBook extends Book{
    private final String downloadUrl;

    public EBook(String title, String author,String downloadUrl) {
        super(title, author);
        this.downloadUrl = downloadUrl;
    }
}
