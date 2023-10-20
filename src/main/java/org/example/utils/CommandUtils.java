package org.example.utils;

import org.example.command.Command;

import java.util.HashMap;
import java.util.Map;

public class CommandUtils {
    public void printlnCommands(Map<String, Command> commandMap) {
        for (Map.Entry<String, Command> entry : commandMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue().getInformation();

            System.out.println(key + " " + value);
        }
    }
}

