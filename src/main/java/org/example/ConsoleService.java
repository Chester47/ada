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

    void getPlayerPassword() {
        System.out.print("Введите пароль игрока: ");
        String password = scanner.nextLine();

        PasswordEncoderService encoder = new PasswordEncoderService();
        String encryptedPassword = encoder.encryptPassword(password, 1);

        System.out.print(encryptedPassword + '\n');
    }
}


