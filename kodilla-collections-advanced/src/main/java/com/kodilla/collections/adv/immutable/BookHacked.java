package com.kodilla.collections.adv.immutable;

class BookHacked  {
    public  String realTitle;
    public BookHacked(String author, String title) {
        super(author, title);
        realTitle = title;
    }

    public void modifyTitle(String newTitle) {
        realTitle = newTitle;
    }
}
