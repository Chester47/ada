package org.example.command;

import org.example.service.PersonService;

public class ClearPersonCacheCommand implements Command {
    private PersonService personService = new PersonService();

    @Override
    public void apply() {
        personService.clearPersCache();
    }

    @Override
    public String getInformation() {
        return "Удаление кэшированных пользователей";
    }

    @Override
    public String getCode() {
        return "7";
    }
}
