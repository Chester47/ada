package org.example;

import java.util.Scanner;

public class ConsoleService {
    private Scanner scanner = new Scanner(System.in);

    public void getUserInformationOld() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ник игрока: ");
        String nickname = scanner.nextLine();
        System.out.print("Введите логин игрока: ");
        String login = scanner.nextLine();
        System.out.println("Введите пароль игрока: ");
        String password = scanner.nextLine();
    }

    public void getUserInformationNew() {
        ConsoleService consoleService = new ConsoleService();
        consoleService.getPlayerNickname();
        consoleService.getPlayerPassword();
        consoleService.getPlayerLogin();
    }

    private void getPlayerNickname() {
        System.out.print("Введите ник игрока: ");
        String nickname = scanner.nextLine();
    }

    private void getPlayerLogin() {
        System.out.print("Введите логин игрока: ");
        String login = scanner.nextLine();
    }

    private void getPlayerPassword() {
        System.out.print("Веедите пароль игрока: ");
        String password = scanner.nextLine();
    }
}


