package com.diwakar.spring.Library;

import java.util.List;

public class Bookshop {

    public List<Book> getListofBooks() {
        return listofBooks;
    }

    public void setListofBooks(List<Book> listofBooks) {
        this.listofBooks = listofBooks;
    }

    public List<Book> listofBooks;
}
