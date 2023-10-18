package org.example.command;

import org.example.service.PersonService;

public class AddFakePersonCommand implements Command{
    private PersonService personService = new PersonService();
    @Override
    public void apply() {
        personService.createFakePerson();
    }

    @Override
    public String getInformation() {
        return "Создание случайного пользователя";
    }

    @Override
    public String getCode() {
        return "4";
    }
}