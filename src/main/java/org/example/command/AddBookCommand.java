package org.example.command;

import lombok.RequiredArgsConstructor;
import org.example.service.BookService;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AddBookCommand implements Command {

    private final BookService bookService;

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
