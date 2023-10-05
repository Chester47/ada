package org.example;

import java.util.Scanner;

public class Dispatcher {
    public void invoke() {
        if (false) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите ник игрока: ");
            String nickname = scanner.nextLine();
            System.out.print("Введите логин игрока: ");
            String login = scanner.nextLine();
            System.out.println("Введите пароль игрока: ");
            String password = scanner.nextLine();
        } else {
            Dispatcher dispatcher = new Dispatcher();
            dispatcher.invokeConsole();
        }
    }

    public void invokeConsole() {
        ConsoleUtils consoleUtils = new ConsoleUtils();
        consoleUtils.getPlayerNickname();
        consoleUtils.getPlayerPassword();
        consoleUtils.getPlayerLogin();
    }
}
