package org.example.service.command;

import org.example.entity.Person;
import org.example.service.PersonService;

public class PersonCommand implements Command {

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
        return "нУ ТИП эт инфу хранит вот";
    }

}

