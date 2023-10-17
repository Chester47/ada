package org.example.utils;

import java.util.Scanner;

public class ConsoleUtils {
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
        ConsoleUtils consoleUtils = new ConsoleUtils();
        consoleUtils.getPlayerNickname();
        consoleUtils.getPlayerPassword();
        consoleUtils.getPlayerLogin();
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

        PasswordEncoderUtils encoder = new PasswordEncoderUtils();
        String encryptedPassword = encoder.encryptPassword(password, 1);

        System.out.print(encryptedPassword + '\n');
    }

    public String getFirstName() {
        System.out.print("Введите имя: ");
        String firstName = scanner.nextLine();
        return firstName;
    }

    public String getSecondName() {
        System.out.print("Введите фамилию: ");
        String secondName = scanner.nextLine();
        return secondName;
    }

    public String getNumber() {
        System.out.print("Введмте номер телефона: ");
        String number = scanner.nextLine();
        if (number.length() == 11) {
            System.out.println("Длина строки равна 11 символам.");
            return number;
        } else {
            System.out.println("Длина строки не равна 11 символам. Повторите ввод.");
            return getNumber();
        }
    }
    public String getCode() {
        System.out.println("Введите код команды: ");
        String gcode = scanner.nextLine();
        return gcode;
    }

    public String getAuthor() {
        System.out.println("Введите автора: ");
        String author = scanner.nextLine();
        return author;
    }
    public String getTitle() {
        System.out.println("Введите заглавие книги: ");
        String title = scanner.nextLine();
        return title;
    }
}



