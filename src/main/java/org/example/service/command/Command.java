package org.example.service.command;

public interface Command {
    void apply();
    String getInformation();
    String getCode();
}
