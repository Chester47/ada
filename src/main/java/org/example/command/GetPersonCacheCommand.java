package org.example.command;

import org.example.service.PersonCacheService;

public class GetPersonCacheCommand implements Command {

    @Override
    public void apply() {
        System.out.println(PersonCacheService.getInstance().getCachePersons());
    }

    @Override
    public String getInformation() {
        return "Выводит в консоль кешированных пользователей";
    }

    @Override
    public String getCode() {
        return "1";
    }
}
