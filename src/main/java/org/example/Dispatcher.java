package org.example;

public class Dispatcher {
    public void invoke() {
        ConsoleService consoleService = new ConsoleService();
        if(false) {
            consoleService.getUserInformationOld();
        } else {
            consoleService.getUserInformationNew();

        }


    }
}

