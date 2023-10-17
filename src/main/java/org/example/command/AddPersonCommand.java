package org.example.command;

import org.example.entity.Person;
import org.example.service.PersonService;

public class AddPersonCommand implements Command {

    PersonService personService = new PersonService();

    @Override
    public String getCode() {
        return "0";
    }

    @Override
    public void apply() {
        Person user = personService.createPerson();

    }

    @Override
    public String getInformation() {
        return "Создаёт пользователя";
    }

}

