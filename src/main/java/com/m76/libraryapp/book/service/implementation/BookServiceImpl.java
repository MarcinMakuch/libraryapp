package com.m76.libraryapp.book.service.implementation;

import com.m76.libraryapp.book.exception.BookNotFoundException;
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
        return bookRepository.findById(id).orElseThrow(() ->
                new BookNotFoundException("Book", "Id", id));
    }

    public Book updateBook(Book book, long id) {
        Book existingBook = bookRepository.findById(id).orElseThrow(() ->
                new BookNotFoundException("Book", "Id", id));
        existingBook.setAuthor(book.getAuthor());
        existingBook.setTitle(book.getTitle());
        existingBook.setPublisher(book.getPublisher());
        existingBook.setPages(book.getPages());
        existingBook.setYearOfPublishing(book.getYearOfPublishing());
        existingBook.setIsAvailable(book.getIsAvailable());
        bookRepository.save(existingBook);
        return existingBook;
    }

    public void delateBookById(long id) {
        bookRepository.findById(id).orElseThrow(() ->
                new BookNotFoundException("Book", "Id", id));
        bookRepository.deleteById(id);
    }
}
