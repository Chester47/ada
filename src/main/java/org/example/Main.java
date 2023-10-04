package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if (false) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите ник игрока: ");
            String nickname = scanner.nextLine();
            System.out.print("Введите логин игрока: ");
            String login = scanner.nextLine();
            System.out.println("Ник игрока: " + nickname);
            System.out.println("Логин игрока: " + login);
        } else {
            Main amogus = new Main();
            amogus.invokeConsole();
        }
    }

    public void invokeConsole() {
        ConsoleUtils amogus1 = new ConsoleUtils();
        amogus1.getPlayerNickname();
        amogus1.getPlayerPassword();
        amogus1.getPlayerLogin();
    }
}


