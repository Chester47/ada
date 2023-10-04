package org.example;

import java.util.Scanner;

public class ConsoleUtils {
    Scanner scanner = new Scanner(System.in);
    public void getPlayerNickname() {
        System.out.print("Введите ник игрока: ");
        String nickname = scanner.nextLine();
    }
    public void getPlayerLogin() {
        System.out.print("Введите логин игрока: ");
        String login = scanner.nextLine();
    }

    public void getPlayerPassword() {
        System.out.print("Веедите пароль игрока: ");
        String password = scanner.nextLine();
    }
}

