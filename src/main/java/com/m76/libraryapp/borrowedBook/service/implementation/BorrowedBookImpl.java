package com.m76.libraryapp.borrowedBook.service.implementation;

import com.m76.libraryapp.borrowedBook.model.BorrowedBook;
import com.m76.libraryapp.borrowedBook.repository.BorrowedBookRepository;
import com.m76.libraryapp.borrowedBook.service.BorrowedBookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BorrowedBookImpl implements BorrowedBookService {

    private final BorrowedBookRepository borrowedBookRepository;

    @Override
    public BorrowedBook addBorrowed(BorrowedBook borrowedBook) {
        return borrowedBookRepository.save(borrowedBook);
    }
}
