package org.example.service;

import org.example.api.ExchangeRatesApi;
import org.example.api.RandomSalaryApi;
import org.example.entity.Person;
import org.example.service.cache.PersonCache;
import org.example.utils.ConsoleUtils;
import org.example.utils.CurrencyUtils;

import java.util.List;
import java.util.Random;

public class PersonService {

    private ConsoleUtils consoleUtils = new ConsoleUtils();
    private RandomSalaryApi randomSalaryApi = new RandomSalaryApi();
    private ExchangeRatesApi exchangeRatesApi = new ExchangeRatesApi();

    public Person createPerson() {
        String firstName = consoleUtils.getFirstName();
        String secondName = consoleUtils.getSecondName();
        String number = consoleUtils.getNumber();
        int min = consoleUtils.getMinFromConsole();
        int max = consoleUtils.getMaxFromConsole();
        int count = consoleUtils.getCountFromConsole();

        String salaryInEur = randomSalaryApi.getRandomSalary(min, max, count).replaceAll("\\[|\\]", "");
        double eurToRubRate = exchangeRatesApi.receiveEurToRubRate();
        double salaryInEurValue = Double.parseDouble(salaryInEur);
        double salaryInRubles = salaryInEurValue * eurToRubRate;
        Person person = new Person(firstName, secondName, number, salaryInEur, String.valueOf(salaryInRubles));
        System.out.println(person.toString());
        PersonCache.getInstance().addPerson(person);
        return person;
    }



    public Person createFakePerson() {
        String firstName = generateRandomFirstName();
        String secondName = generateRandomSecondName();
        String number = generateRandomNumber();
        int min = consoleUtils.getMinFromConsole();
        int max = consoleUtils.getMaxFromConsole();
        int count = consoleUtils.getCountFromConsole();
        String salary = randomSalaryApi.getRandomSalary(min, max, count);
        Person fakePerson = new Person(firstName, secondName, number, salary,"");

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
