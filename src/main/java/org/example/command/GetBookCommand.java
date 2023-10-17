package org.example.command;

import org.example.service.BookCacheService;

public class GetBookCommand implements Command {

    @Override
    public void apply() {
        System.out.println(BookCacheService.getInstance().getCacheBook());
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
