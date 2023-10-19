package org.example.service;

import lombok.SneakyThrows;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
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

    @SneakyThrows
    public void generateRandomBook() {
        HttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("https://random-word-api.herokuapp.com/word?number=1");
        String response = EntityUtils.toString(httpClient.execute(httpGet).getEntity());
        Book book = new Book(
                PersonCacheService.getInstance().findByFirstName(consoleUtils.getFirstName()),
                response,
                LocalDateTime.now()
        );
        BookCacheService.getInstance().addBook(book);
    }
}


