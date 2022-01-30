package com.kodilla.collections.adv.immutable;

public  class Book {
    protected  String author;
    protected  String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public final String getAuthor() {
        return author;
    }

    public final String getTitle() {
        return title;
    }
}
