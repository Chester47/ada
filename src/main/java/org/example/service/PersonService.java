package org.example.service;

import org.example.entity.Person;
import org.example.utils.ConsoleUtils;

public class PersonService {

    ConsoleUtils consoleUtils = new ConsoleUtils();

    public Person createPerson() {
        Person person = new Person(
                consoleUtils.getFirstName(),
                consoleUtils.getSecondName(),
                consoleUtils.getNumber());
        System.out.println(person.toString());
        PersonCacheService.getInstance().addPerson(person);
        return person;
    }

}

