package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashSet;
import java.util.Set;

public class BookApplication {
    public static void main(String[] args) {
        Book book1 = new Book ("Pan Tadeusz", "Adam Mickiewicz");
        Book book2 = new Book ("The Nonconformist", "Laura Marsh");
        Book book3 = new Book ("Pan Tadeusz", "Adam Mickiewicz");



        System.out.println(book1.title == book3.title && book1.author == book3.author);
        System.out.println(book1.title == book2.title && book1.author == book2.author);
        System.out.println(book2.title == book3.title && book2.author == book3.author);


        Book book4 = BookManager.createBook("Pan Tadeusz", "Adam Mickiewicz");
        Book book5 = BookManager.createBook("The Nonconformist", "Laura Marsh");
        Book book6 = BookManager.createBook("Pan Tadeusz", "Adam Mickiewicz");

        System.out.println(book1.hashCode() == book4.hashCode());
        System.out.println(book2.hashCode() == book5.hashCode());
        System.out.println(book3.hashCode() == book6.hashCode());
    }
}
