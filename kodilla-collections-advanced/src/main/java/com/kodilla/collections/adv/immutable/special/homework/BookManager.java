package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class BookManager extends Book {

    String title;
    String author;
    static Set<Book> booksCheck = new HashSet<>();

    public BookManager(String title, String author) {
        super(author, title);
    }
    public static Book createBook (String title, String author) {
        System.out.println(booksCheck.size());
        if (booksCheck.contains(title) == false && booksCheck.contains(author) == false) {
            booksCheck.add(createBook(title, author));
            return new Book(title, author);
        }
        return new Book(title, author);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookManager that = (BookManager) o;
        return Objects.equals(title, that.title) && Objects.equals(author, that.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }

    @Override
    public String toString() {
        return "BookManager{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
