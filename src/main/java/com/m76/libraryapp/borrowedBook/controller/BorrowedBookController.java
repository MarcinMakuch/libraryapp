package com.m76.libraryapp.borrowedBook.controller;

import com.m76.libraryapp.borrowedBook.model.BorrowedBook;
import com.m76.libraryapp.borrowedBook.service.BorrowedBookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/borrowedbook")
public class BorrowedBookController {

    private final BorrowedBookService borrowedBookService;

    public BorrowedBookController(BorrowedBookService borrowedBookService) {
        super();
        this.borrowedBookService = borrowedBookService;
    }

    @PostMapping
    public ResponseEntity<BorrowedBook> saveBorrowedBook(@RequestBody BorrowedBook borrowedBook){
        return new ResponseEntity<BorrowedBook>(borrowedBookService.saveBorrowed(borrowedBook), HttpStatus.CREATED);
    }

    @GetMapping
    public List<BorrowedBook> getAllBorrowedBooks(){
        return borrowedBookService.getAllBorrowedBooks();
    }

    @GetMapping("{id}")
    public ResponseEntity<BorrowedBook> getBorrowedById(@PathVariable("id") long id){
        return new ResponseEntity<BorrowedBook>(borrowedBookService.findBorrowedById(id), HttpStatus.OK);
    }
}
