package org.example.command;

import org.example.service.BookService;

public class GetBookCommand implements Command {
    private BookService bookService = new BookService();

    @Override
    public void apply() {
        bookService.getBookCache();
    }

    @Override
    public String getInformation() {
        return "Получение книг из кеша";
    }

    @Override
    public String getCode() {
        return "3";
    }
}
