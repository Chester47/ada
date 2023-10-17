package org.example.service;

import org.example.entity.Book;
import org.example.utils.ConsoleUtils;

import java.time.LocalDateTime;

public class BookService {
    private ConsoleUtils consoleUtils = new ConsoleUtils();

    public Book createBook() {
        Book book = new Book(
                PersonCacheService.getInstance().findByFirstName(consoleUtils.getFirstName()),
                consoleUtils.getTitle(),
                LocalDateTime.now());
        BookCacheService.getInstance().addBook(book);
        return book;
    }
}
