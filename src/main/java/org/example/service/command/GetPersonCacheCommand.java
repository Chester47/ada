package org.example.service.command;

import org.example.entity.Person;
import org.example.service.PersonService;

import java.util.List;

public class GetPersonCacheCommand implements Command {
PersonService personService = new PersonService();
    public List<Person> getPersons() {
        List<Person> persons = null;
        return null;
    }
    @Override
    public void apply() {
        List<Person> personList = getPersons();
        for (Person person : personList) {
            System.out.println(person);
        }
    }

    @Override
    public String getInformation() {
        return null;
    }

    @Override
    public String getCode() {
        return null;
    }
}
