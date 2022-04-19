package com.m76.libraryapp.book.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "author", nullable = false)
    private String author;

    @Column(name = "publisher", nullable = false)
    private String publisher;

    @Column(name = "yearOfPublishing", nullable = false)
    private int yearOfPublishing;

    @Column(name = "pages", nullable = false)
    private int pages;

    @Column(name = "isAvailable", nullable = false)
    private boolean isAvailable;


}
