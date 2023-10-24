package org.example.service;

import org.example.api.ExchangeRatesApi;
import org.example.api.RandomSalaryApi;
import org.example.entity.Nalog;
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
    private CurrencyUtils currencyUtils = new CurrencyUtils();
    private Nalog nalog = new Nalog("20", "6");

    public Person createPerson() {
        String firstName = consoleUtils.getFirstName();
        String secondName = consoleUtils.getSecondName();
        String number = consoleUtils.getNumber();

        String salaryInEur = currencyUtils.receiveEurSalary();
        String salaryInRUB = currencyUtils.calculateRubSalary(salaryInEur);
        String salaryInIRR = currencyUtils.calculateIrrSalary(salaryInEur);
        String salaryInFkp = currencyUtils.calculateFkpSalary(salaryInEur);
        Person person = new Person(
                firstName,
                secondName,
                number,
                salaryInEur,
                salaryInRUB,
                salaryInIRR,
                salaryInFkp,
                nalog.calculateNetSalary(salaryInRUB),
                nalog.calculateNetSalary(salaryInIRR),
                nalog.calculateNetSalary(salaryInFkp));

        PersonCache.getInstance().addPerson(person);
        return person;
    }


    public Person createFakePerson() {
        String firstName = generateRandomFirstName();
        String secondName = generateRandomSecondName();
        String number = generateRandomNumber();

        String salaryInEur = currencyUtils.receiveEurSalary();
        String salaryInRUB = currencyUtils.calculateRubSalary(salaryInEur);
        String salaryInIRR = currencyUtils.calculateIrrSalary(salaryInEur);
        String salaryInFkp = currencyUtils.calculateFkpSalary(salaryInEur);
        Person fakePerson = new Person(
                firstName,
                secondName,
                number,
                salaryInEur,
                salaryInRUB,
                salaryInIRR,
                salaryInFkp,
                nalog.calculateNetSalary(salaryInRUB),
                nalog.calculateNetSalary(salaryInIRR),
                nalog.calculateNetSalary(salaryInFkp));

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
