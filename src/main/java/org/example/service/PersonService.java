package org.example.service;

import org.example.entity.Person;
import org.example.service.cache.PersonCache;
import org.example.utils.ConsoleUtils;

import java.util.List;
import java.util.Random;

public class PersonService {

    private ConsoleUtils consoleUtils = new ConsoleUtils();

    public Person createPerson() {
        Person person = new Person(
                consoleUtils.getFirstName(),
                consoleUtils.getSecondName(),
                consoleUtils.getNumber());
        System.out.println(person.toString());
        PersonCache.getInstance().addPerson(person);
        return person;
    }

    public Person createFakePerson() {
        String firstName = generateRandomFirstName();
        String secondName = generateRandomSecondName();
        String number = generateRandomNumber();
        Person fakePerson = new Person(firstName, secondName, number);

        System.out.println(fakePerson.toString());
        PersonCache.getInstance().addPerson(fakePerson);
        return fakePerson;
    }

    private String generateRandomFirstName() {
        // Генерируем случайное имя (просто для примера)
        String[] names = {"John", "Alice", "Bob", "Emily", "David", "Billy"};
        int randomIndex = new Random().nextInt(names.length);
        return names[randomIndex];
    }

    private String generateRandomSecondName() {
        String[] sNames = {"Abramson", "Simens", "Svalow", "Harrington", "Coleman"};
        int randomIndex = new Random().nextInt(sNames.length);
        return sNames[randomIndex];
    }

    private String generateRandomNumber() {
        StringBuilder number = new StringBuilder("79");
        Random random = new Random();
        for (int i = 0; i < 9; i++) {
            int digit = random.nextInt(10);
            number.append(digit);
        }
        return number.toString();
    }
    public void getPersonCache() {
        List<Person> personList = PersonCache.getInstance().getCachePersons();
        System.out.println(personList);
    }
    public void clearPersCache() {
        PersonCache.getInstance().clearPersonCache();
    }
}
