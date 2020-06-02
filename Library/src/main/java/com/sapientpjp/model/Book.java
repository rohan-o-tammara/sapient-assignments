package com.sapientpjp.model;

/**
 * A book in our library
 */
public class Book {

    String title;
    String author;
    String isbn;

    public Book() {

    }

    public Book(String title, String author, String isbn) {
        this.setTitle(title);
        this.setAuthor(author);
        this.setIsbn(isbn);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

}
