package org.example.command;

import lombok.RequiredArgsConstructor;
import org.example.service.BookService;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GetBookCommand implements Command {

    private final BookService bookService;

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
