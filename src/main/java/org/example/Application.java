package org.example;

public class Application {
    public static void main(String[] args) {
        Dispatcher dispatcher = new Dispatcher();
        do {
            dispatcher.invoke();
        } while (true);
    }
}


