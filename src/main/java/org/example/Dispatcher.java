package org.example;

import org.example.command.Command;
import org.example.command.DefaultCommand;
import org.example.command.GetPersonCacheCommand;
import org.example.command.PersonCommand;
import org.example.service.PersonService;
import org.example.utils.ConsoleUtils;

import java.util.HashMap;
import java.util.Map;

public class Dispatcher {


    ConsoleUtils consoleUtils = new ConsoleUtils();
    PersonService personService = new PersonService();
    Map<String, Command> commands = new HashMap<>();

    {
        commands.put(new PersonCommand().getCode(), new PersonCommand());
        commands.put(new GetPersonCacheCommand().getCode(), new GetPersonCacheCommand());
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







