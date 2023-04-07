//package com.amir.spring6learning.controllers;
//
//import com.amir.spring6learning.services.BookService;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import java.util.Collection;
//import java.util.Map;
//
//@Controller
//public class BookController {
//    private final BookService bookService;
//
//    public BookController(BookService bookService) {
//        this.bookService = bookService;
//    }
//
//    @RequestMapping("/books")
//    public String getBooks(Model model) {
//        model.addAttribute("books", bookService.findall());
//        return "books";
//    }
//}
