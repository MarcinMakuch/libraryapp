package com.m76.libraryapp.book.service;

import com.m76.libraryapp.book.model.Book;

import java.util.List;

public interface BookService {

    Book saveBook(Book book);

    List<Book> getAllBooks();

    Book getBookById(long id);

    void updateBook(Book book);

    void delateBookById(long id);
}
