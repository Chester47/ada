package org.example.service;

import org.example.entity.Person;
import org.example.utils.ConsoleUtils;

import java.util.ArrayList;
import java.util.List;

public class PersonService {
    List<Person> persons = new ArrayList<>();

    ConsoleUtils consoleUtils = new ConsoleUtils();
    public Person createPerson() {
        Person person = new Person(
                consoleUtils.getFirstName(),
                consoleUtils.getSecondName(),
                consoleUtils.getNumber());
        System.out.println(person.toString());
        persons.add(person);
        return person;
    }

}

