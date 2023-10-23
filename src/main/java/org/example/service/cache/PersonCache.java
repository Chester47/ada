package org.example.service.cache;

import org.example.entity.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonCache {
    private static PersonCache instance;
    private List<Person> cachePersons = new ArrayList<>();

    private PersonCache() {

    }

    public static PersonCache getInstance() {
        if (instance == null) {
            instance = new PersonCache();
        }
        return instance;
    }

    public void addPerson(Person person) {
        cachePersons.add(person);
    }

    public List<Person> getCachePersons() {
        return cachePersons;
    }

    public Person findByFirstName(String firstName) {
        for (Person person : cachePersons) {
            if (person.getFirstName().equalsIgnoreCase(firstName)) {

                return person;
            }
        }
        return new Person(
                "Пользователь не найден",
                "Пользователь не найден",
                "Пользователь не найден",
                "Пользователь не найден",
            "Пользователь не найден",
        "Пользователь не найден");


    }

    public void clearPersonCache() {
        cachePersons.clear();
    }
}