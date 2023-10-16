package org.example.service;

import org.example.entity.Book;
import org.example.utils.ConsoleUtils;

public class BookService {
    private ConsoleUtils consoleUtils = new ConsoleUtils();
    public Book createBook() {
    Book book = new Book();
        BookCacheService.getInstance().addBook(book);
        return book;
    }
}
