package org.example.command;

import org.example.service.BookService;

public class AddRandomBookCommand implements Command {
    private BookService bookService = new BookService();

    @Override
    public void apply() {
        bookService.generateRandomBook();
    }

    @Override
    public String getInformation() {
        return "Создаёт рандомную книгу";
    }

    @Override
    public String getCode() {
        return "5";
    }
}
