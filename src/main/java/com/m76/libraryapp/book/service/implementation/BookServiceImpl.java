package com.m76.libraryapp.book.service.implementation;

import com.m76.libraryapp.book.model.Book;
import com.m76.libraryapp.book.repository.BookRepository;
import com.m76.libraryapp.book.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        super();
        this.bookRepository = bookRepository;
    }

    @Override
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(long id) {
        return bookRepository.getById(id);
    }

    public void updateBook(Book book) {
        bookRepository.save(book);
    }
    public void delateBookById(long id){
        bookRepository.deleteById(id);
    }
}
