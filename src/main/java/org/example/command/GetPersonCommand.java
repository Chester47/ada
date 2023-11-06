package org.example.command;

import lombok.RequiredArgsConstructor;
import org.example.service.PersonService;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GetPersonCommand implements Command {
    private final PersonService personService;

    @Override
    public void apply() {
        personService.getPersonCache();
    }

    @Override
    public String getInformation() {
        return "Выводит в консоль кешированных пользователей";
    }

    @Override
    public String getCode() {
        return "1";
    }
}
