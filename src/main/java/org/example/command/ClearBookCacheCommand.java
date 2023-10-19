package org.example.command;

import org.example.service.BookCacheService;

public class ClearBookCacheCommand implements Command {

    @Override
    public void apply() {
        BookCacheService.getInstance().clearCache();
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
