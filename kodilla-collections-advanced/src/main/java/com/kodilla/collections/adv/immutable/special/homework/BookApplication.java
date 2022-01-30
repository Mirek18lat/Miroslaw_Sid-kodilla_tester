package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashSet;
import java.util.Set;

public class BookApplication {
    public static void main(String[] args) {
        Book book1 = new BookManager("Pan Tadeusz", "Adam Mickiewicz");
        Book book2 = new BookManager("The Nonconformist", "Laura Marsh");
        Book book3 = new BookManager("Pan Tadeusz", "Adam Mickiewicz");


        System.out.println(book1.title == book3.title && book1.author == book3.author);
        System.out.println(book1.title == book2.title && book1.author == book2.author);
        System.out.println(book2.title == book3.title && book2.author == book3.author);


    }
}
