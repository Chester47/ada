package org.example;

import org.example.command.*;
import org.example.service.PersonService;
import org.example.utils.ConsoleUtils;

import java.util.HashMap;
import java.util.Map;

public class Dispatcher {


    private ConsoleUtils consoleUtils = new ConsoleUtils();
    private PersonService personService = new PersonService();
    private Map<String, Command> commands = new HashMap<>();

    {
        commands.put(new AddPersonCommand().getCode(), new AddPersonCommand());
        commands.put(new GetPersonCommand().getCode(), new GetPersonCommand());
        commands.put(new AddBookCommand().getCode(), new AddBookCommand());
        commands.put(new GetBookCommand().getCode(), new GetBookCommand());
    }

    public void invoke() {

        if (false) {
            consoleUtils.getUserInformationNew();
            consoleUtils.getUserInformationOld();
            personService.createPerson();
        } else {
            for (Map.Entry<String, Command> entry : commands.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue().getInformation();

                System.out.println(key + " " + value);
            }
            String code = consoleUtils.getCode();
            Command command = commands.getOrDefault(code, new DefaultCommand());
            command.apply();
        }
    }
}







