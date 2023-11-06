package org.example.command;

import lombok.RequiredArgsConstructor;
import org.example.entity.Person;
import org.example.service.PersonService;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AddPersonCommand implements Command {

    private final PersonService personService;

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

