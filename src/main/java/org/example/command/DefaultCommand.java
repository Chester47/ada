package org.example.command;

public class DefaultCommand implements Command {
    @Override
    public void apply() {
        System.out.println("Не найден код");
    }
    @Override
    public String getInformation() {
        return null;
    }
    @Override
    public String getCode() {
        return null;
    }
}
