package com.m76.libraryapp.borrowedBook.model;


import com.m76.libraryapp.book.model.Book;
import com.m76.libraryapp.user.model.User;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "borrowedbooks")
public class BorrowedBook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private User user;

    @OneToOne
    private Book book;

}
