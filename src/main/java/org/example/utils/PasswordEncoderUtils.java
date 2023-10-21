package org.example.utils;

public class PasswordEncoderUtils {
    public String encryptPassword(String password, Integer offset) {
        char[] charArray = password.toCharArray(); // ['1', '2', ...]
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            char encryptedChar = (char) (c + offset);

            sb.append(encryptedChar); // "234бвг"
        }

        return sb.toString();
    }
}
