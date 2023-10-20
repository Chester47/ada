package org.example;

import org.example.command.*;
import org.example.service.PersonService;
import org.example.utils.CommandUtils;
import org.example.utils.ConsoleUtils;

import java.util.HashMap;
import java.util.Map;

public class Dispatcher {


    private ConsoleUtils consoleUtils = new ConsoleUtils();
    private PersonService personService = new PersonService();
    private CommandUtils commandUtils = new CommandUtils();
    private Map<String, Command> commands = new HashMap<>();


    {
        commands.put(new AddPersonCommand().getCode(), new AddPersonCommand());
        commands.put(new GetPersonCommand().getCode(), new GetPersonCommand());
        commands.put(new AddBookCommand().getCode(), new AddBookCommand());
        commands.put(new GetBookCommand().getCode(), new GetBookCommand());
        commands.put(new AddFakePersonCommand().getCode(), new AddFakePersonCommand());
        commands.put(new AddRandomBookCommand().getCode(), new AddRandomBookCommand());
        commands.put(new ClearBookCacheCommand().getCode(), new ClearBookCacheCommand());
        commands.put(new ClearPersonCacheCommand().getCode(), new ClearPersonCacheCommand());
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







