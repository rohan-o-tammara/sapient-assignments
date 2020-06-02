package com.sapientpjp.model;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.sapientpjp.controller.BookController;
import com.sapientpjp.exceptions.InvalidBookException;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class BookTest
{
    @Mock
    BookController bookController;

    @Before
    public void setup() throws Exception {

        MockitoAnnotations.initMocks(this);

    }

    @Test
    public void validBooksTest() throws InvalidBookException {

        Book testBook = new Book("Paths of Glory", "Jeffrey Archer", "0330511661");

        when(bookController.newBook(testBook)).thenReturn(Boolean.TRUE);
        assertTrue(bookController.newBook(testBook));

    }
}
