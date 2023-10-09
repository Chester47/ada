package org.example;

import org.example.service.ConsoleService;

public class Dispatcher {
    public void invoke() {
        ConsoleService consoleService = new ConsoleService();

        if (false) {
            consoleService.getUserInformationOld();
        } else {
            consoleService.getUserInformationNew();
        }
    }
}

