package com.sapientpjp.dao;

import com.sapientpjp.model.Book;

public class BookDAO {

    public void newBook(Book book) {

        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("ISBN: " + book.getIsbn());
    }

}
