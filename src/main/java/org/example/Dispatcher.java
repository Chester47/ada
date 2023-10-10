package org.example;

import org.example.service.PersonService;
import org.example.utils.ConsoleUtils;

public class Dispatcher {
    public void invoke() {
        ConsoleUtils consoleUtils = new ConsoleUtils();
        PersonService personService = new PersonService();

        if (false) {
            consoleUtils.getUserInformationNew();
            consoleUtils.getUserInformationOld();
        } else {
            personService.createPerson();
        }
    }
}

