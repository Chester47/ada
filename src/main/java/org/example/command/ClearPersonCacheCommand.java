package org.example.command;

import lombok.RequiredArgsConstructor;
import org.example.service.PersonService;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ClearPersonCacheCommand implements Command {

    private final PersonService personService;

    @Override
    public void apply() {
        personService.clearPersCache();
    }

    @Override
    public String getInformation() {
        return "Удаление кэшированных пользователей";
    }

    @Override
    public String getCode() {
        return "7";
    }
}
