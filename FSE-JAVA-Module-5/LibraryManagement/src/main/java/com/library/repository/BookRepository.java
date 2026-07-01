package com.library.repository;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    public BookRepository() {
        //System.out.println("BookRepository bean is created");
    }

    public void saveBook() {
        System.out.println("Book is Saved  in BookRepository");
    }

}
