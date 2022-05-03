package com.m76.libraryapp.borrowedBook.repository;

import com.m76.libraryapp.borrowedBook.model.BorrowedBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BorrowedBookRepository extends JpaRepository<BorrowedBook, Long> {

}
