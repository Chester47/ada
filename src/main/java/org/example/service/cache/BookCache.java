package org.example.service.cache;

import org.example.entity.Book;

import java.util.ArrayList;
import java.util.List;

public class BookCache {
    private static BookCache instance;

    private List<Book> cacheBook = new ArrayList<>();

    private BookCache() {

    }

    public static BookCache getInstance() {
        if (instance == null) {
            instance = new BookCache();
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

