package com.m76.libraryapp.borrowedBook.service;

import com.m76.libraryapp.borrowedBook.model.BorrowedBook;
import com.m76.libraryapp.borrowedBook.repository.BorrowedBookRepository;

import java.util.List;

public interface BorrowedBookService {

    BorrowedBook saveBorrowed(BorrowedBook borrowedBook);
    List<BorrowedBook> getAllBorrowedBooks();
    BorrowedBook findBorrowedById(long id);

}
