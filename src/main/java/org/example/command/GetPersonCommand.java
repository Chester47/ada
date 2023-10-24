package org.example.command;

import org.example.service.PersonService;

public class GetPersonCommand implements Command {
    private PersonService personService = new PersonService();

    @Override
    public void apply() {
        personService.getPersonCache();
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
