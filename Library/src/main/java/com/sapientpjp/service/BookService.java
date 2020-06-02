package com.sapientpjp.service;

import com.sapientpjp.contracts.IBookService;
import com.sapientpjp.dao.BookDAO;
import com.sapientpjp.exceptions.InvalidBookException;
import com.sapientpjp.model.Book;

public class BookService implements IBookService {

    BookDAO dao = new BookDAO();

    public boolean newBook(Book book) throws InvalidBookException{
        boolean insertSuccess = false;
        if (book.getIsbn().length() != 10 && book.getIsbn().length() != 13) {
            throw new InvalidBookException("The ISBN of this book does not match standards. Enter the correct value.");
        }
        else {
            dao.newBook(book);
            insertSuccess = true;
        }
        return insertSuccess;
    }

}
