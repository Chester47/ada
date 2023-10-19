package org.example.service;

import org.example.entity.Book;

import java.util.ArrayList;
import java.util.List;

public class BookCacheService {
    private static BookCacheService instance;

    private List<Book> cacheBook = new ArrayList<>();

    private BookCacheService() {

    }

    public static BookCacheService getInstance() {
        if (instance == null) {
            instance = new BookCacheService();
        }
        return instance;
    }

    public void addBook(Book book) {
        cacheBook.add(book);
    }

    public List<Book> getCacheBook() {
        return cacheBook;
    }
    public void clearCache() {
        cacheBook.clear();
    }
}

