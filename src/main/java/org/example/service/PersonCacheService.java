package org.example.service;

import org.example.entity.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonCacheService {
    private static PersonCacheService instance;
    private List<Person> cachePersons = new ArrayList<>();

    private PersonCacheService() {

    }

    public static PersonCacheService getInstance() {
        if (instance == null) {
            instance = new PersonCacheService();
        }
        return instance;
    }

    public void addPerson(Person person) {
        cachePersons.add(person);
    }

    public List<Person> getCachePersons() {
        return cachePersons;
    }
}

