package org.example.controller;

import lombok.AllArgsConstructor;
import org.example.entity.Person;
import org.example.service.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class PersonController {
    private final PersonService personService;
    @GetMapping(path = "fake-persons/create")
    public String createFakePerson() {
        Person fakePerson = personService.createFakePerson();
        return fakePerson.toString();
    }
    @GetMapping(path = "create/persons")
    public String createPersons() {
        Person person = personService.createPerson();
        return person.toString();
    }
}
