package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class BookManager {

    static String title;
    static String author;
    static Set<Book> listBooks = new HashSet<>();

    public static Book createBook (String title, String author) {
        Book book = new Book(title, author);
        if (listBooks.contains(book)) {
            System.out.println("Objekt już istnieje");
            } else listBooks.add(book);

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
