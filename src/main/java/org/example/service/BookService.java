package org.example.service;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.example.api.RandomWordApi;
import org.example.entity.Book;
import org.example.repository.BookRepository;
import org.example.service.cache.BookCache;
import org.example.service.cache.PersonCache;
import org.example.utils.ConsoleUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final RandomWordApi randomWordApi;
    private final ConsoleUtils consoleUtils;
    private final BookRepository bookRepository;

    public Book createBook() {
        Book book = new Book(
                0L,
                PersonCache.getInstance().findByFirstName(consoleUtils.getFirstName()),
                consoleUtils.getTitle(),
                LocalDateTime.now());
        book = bookRepository.save(book);
        BookCache.getInstance().addBook(book);
        return book;
    }

    @SneakyThrows
    public void generateRandomBook() {
        Book book = new Book(
                0L,
                PersonCache.getInstance().findByFirstName(consoleUtils.getFirstName()),
                randomWordApi.receiveTitle(),
                LocalDateTime.now());
        book = bookRepository.save(book);
        BookCache.getInstance().addBook(book);
    }

    public void getBookCache() {
        List<Book> bookList = BookCache.getInstance().getCacheBook();
        System.out.println(bookList);
    }

    public void clearCache() {
        BookCache.getInstance().clearCache();
    }
}
