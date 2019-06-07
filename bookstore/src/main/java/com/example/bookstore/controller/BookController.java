package com.example.bookstore.controller;

import java.util.ArrayList;
import java.util.List;

import com.example.bookstore.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class BookController {
    @GetMapping(value="/index")
    public String booklist(Model model) {
        List<Book> bookList = new ArrayList<Book>();
        for (int i = 0; i <10; i++) {
            Book book =new Book();
            bookList.add(book);
        }

        model.addAttribute("books", bookList);
        return "index";
    }

}
