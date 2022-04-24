package com.m76.libraryapp.book.controller;

import com.m76.libraryapp.book.model.Book;
import com.m76.libraryapp.book.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService){
        super();
        this.bookService = bookService;
    }

    @PostMapping()
    public ResponseEntity<Book> saveBook(@RequestBody Book book){
        return new ResponseEntity<Book>(bookService.saveBook(book), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("{id}")
    public ResponseEntity<Book> getBookById(@PathVariable("id") long id){
        return new ResponseEntity<Book>(bookService.getBookById(id), HttpStatus.OK);
    }
    @PutMapping("{id}")
    public ResponseEntity<Book> updateBook(@PathVariable("id") long id, @RequestBody Book book){
        return new ResponseEntity<Book>(bookService.updateBook(book, id), HttpStatus.OK);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteBook(@PathVariable("id") long id){
        bookService.delateBookById(id);
        return new ResponseEntity<String>("Book was deleted", HttpStatus.OK);
    }

}
