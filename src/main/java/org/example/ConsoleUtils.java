package org.example;

import java.util.Scanner;

public class ConsoleUtils {
    public void getPlayerNickname() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ник игрока: ");
    }
    public void getPlayerLogin() {
        Scanner scanner = null;
        String nickname = scanner.nextLine();
        System.out.print("Введите логин игрока: ");
    }
    public void getPlayerPassword() {
        String nickname = null;
        System.out.println("Ник игрока: " + nickname);
        String login = null;
        System.out.println("Логин игрока: " + login);
    }
}

