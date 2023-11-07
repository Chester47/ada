package org.example.command;

import lombok.RequiredArgsConstructor;
import org.example.service.BookService;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AddRandomBookCommand implements Command {

    private final BookService bookService;

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
