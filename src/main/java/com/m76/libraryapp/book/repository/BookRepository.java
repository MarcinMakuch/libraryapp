package com.m76.libraryapp.book.repository;

import com.m76.libraryapp.book.model.Book;
import com.m76.libraryapp.borrowedBook.model.BorrowedBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
