package org.example.command;

import lombok.RequiredArgsConstructor;
import org.example.service.BookService;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ClearBookCacheCommand implements Command {

    private final BookService bookService;

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
