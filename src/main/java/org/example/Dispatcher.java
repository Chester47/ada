package org.example;

import lombok.RequiredArgsConstructor;
import org.example.command.*;
import org.example.service.PersonService;
import org.example.utils.CommandUtils;
import org.example.utils.ConsoleUtils;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class Dispatcher {


    private ConsoleUtils consoleUtils = new ConsoleUtils();

    private final PersonService personService;

    private final GetPersonCommand getPersonCommand;

    private final ClearPersonCacheCommand clearPersonCacheCommand;

    private final AddPersonCommand addPersonCommand;

    private final AddFakePersonCommand addFakePersonCommand;
    private CommandUtils commandUtils = new CommandUtils();
    private Map<String, Command> commands = new HashMap<>();


    @PostConstruct
    public void initialize() {
        commands.put(addPersonCommand.getCode(), addPersonCommand);
        commands.put(getPersonCommand.getCode(), clearPersonCacheCommand);
        commands.put(new AddBookCommand().getCode(), new AddBookCommand());
        commands.put(new GetBookCommand().getCode(), new GetBookCommand());
        commands.put(addFakePersonCommand.getCode(), addFakePersonCommand);
        commands.put(new AddRandomBookCommand().getCode(), new AddRandomBookCommand());
        commands.put(new ClearBookCacheCommand().getCode(), new ClearBookCacheCommand());
        commands.put(clearPersonCacheCommand.getCode(), clearPersonCacheCommand);
    }
    public void invoke() {

        if (false) {
            consoleUtils.getUserInformationNew();
            consoleUtils.getUserInformationOld();
            personService.createPerson();
        } else {
            commandUtils.printlnCommands(commands);
            String code = consoleUtils.getCode();
            Command command = commands.getOrDefault(code, new DefaultCommand());
            command.apply();
        }
    }
}







