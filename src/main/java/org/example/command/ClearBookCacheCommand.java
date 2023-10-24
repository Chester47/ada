package org.example.command;

import org.example.service.BookService;

public class ClearBookCacheCommand implements Command {
    private BookService bookService = new BookService();

    @Override
    public void apply() {
        bookService.clearCache();
    }

    @Override
    public String getInformation() {
        return "Очистить кэш книг";
    }

    @Override
    public String getCode() {
        return "6";
    }
}
