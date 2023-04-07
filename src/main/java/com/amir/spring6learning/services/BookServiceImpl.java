//package com.amir.spring6learning.services;
//
//import com.amir.spring6learning.domain.Book;
//import com.amir.spring6learning.repositories.BookRepository;
//import org.springframework.stereotype.Service;
//
//@Service
//public class BookServiceImpl implements BookService{
//
//    private final BookRepository bookRepository;
//
//    public BookServiceImpl(BookRepository bookRepository) {
//        this.bookRepository = bookRepository;
//    }
//
//    @Override
//    public Iterable<Book> findall() {
//        return bookRepository.findAll();
//    }
//}
