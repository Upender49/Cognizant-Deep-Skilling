package com.library.service;

import com.library.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    private  BookRepository bookRepository;
    public BookService(BookRepository bookRepository) {
        System.out.println("Constructor is called ");
        this.bookRepository = bookRepository;
    }
    public void displayBooks() {
        System.out.println("Displaying Books...");
    }
    public void  setBookRepository(BookRepository bookRepository){
        System.out.println("Set method is called ");
        this.bookRepository = bookRepository;
    }
    public void servicemethod(){
        bookRepository.saveBook();
    }
}
