package org.example.controller;

import lombok.AllArgsConstructor;
import org.example.entity.Book;
import org.example.service.BookService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class BookController {
    private final BookService bookService;
    @GetMapping("create/book")
    public String createBook() {
        Book createBook = bookService.createBook();
        return createBook.toString();
    }
}
