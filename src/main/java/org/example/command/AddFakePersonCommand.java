package org.example.command;

import lombok.RequiredArgsConstructor;
import org.example.service.PersonService;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AddFakePersonCommand implements Command {
    private final PersonService personService;

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