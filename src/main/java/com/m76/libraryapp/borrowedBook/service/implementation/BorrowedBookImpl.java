package com.m76.libraryapp.borrowedBook.service.implementation;

import com.m76.libraryapp.borrowedBook.model.BorrowedBook;
import com.m76.libraryapp.borrowedBook.repository.BorrowedBookRepository;
import com.m76.libraryapp.borrowedBook.service.BorrowedBookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BorrowedBookImpl implements BorrowedBookService {

    private final BorrowedBookRepository borrowedBookRepository;

    @Override
    public BorrowedBook saveBorrowed(BorrowedBook borrowedBook) {
        return borrowedBookRepository.save(borrowedBook);
    }

    @Override
    public List<BorrowedBook> getAllBorrowedBooks() {
        return borrowedBookRepository.findAll();
    }

    @Override
    public BorrowedBook findBorrowedById(long id) {
        return borrowedBookRepository.getById(id);
    }

}
