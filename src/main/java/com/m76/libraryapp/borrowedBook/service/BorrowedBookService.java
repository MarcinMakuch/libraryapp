package com.m76.libraryapp.borrowedBook.service;

import com.m76.libraryapp.borrowedBook.model.BorrowedBook;
import com.m76.libraryapp.borrowedBook.repository.BorrowedBookRepository;

public interface BorrowedBookService {

    BorrowedBook addBorrowed(BorrowedBook borrowedBook);

}
