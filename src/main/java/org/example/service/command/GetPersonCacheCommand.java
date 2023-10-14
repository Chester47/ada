package org.example.service.command;

import org.example.service.PersonService;

public class GetPersonCacheCommand implements Command {
    PersonService personService = new PersonService();

    @Override
    public void apply() {
        System.out.println(personService.getPersons());
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
