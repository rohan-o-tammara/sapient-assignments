package com.sapientpjp.contracts;

import com.sapientpjp.exceptions.InvalidBookException;
import com.sapientpjp.model.Book;

public interface IBookService {

    public boolean newBook(Book book) throws InvalidBookException;

}
