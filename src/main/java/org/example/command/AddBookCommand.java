package org.example.command;

import org.example.service.BookService;

public class AddBookCommand implements Command {
    private BookService bookService = new BookService();

    @Override
    public void apply() {
        bookService.createBook();
    }

    @Override
    public String getInformation() {
        return "Создание книги";
    }

    @Override
    public String getCode() {
        return "2";
    }
}
