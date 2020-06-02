package com.sapientpjp.controller;

import com.sapientpjp.model.Book;
import com.sapientpjp.service.BookService;

public class BookController {

    BookService service = new BookService();

    public boolean newBook(Book book) {
        try {
            return service.newBook(book);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
