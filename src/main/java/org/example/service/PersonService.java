package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.api.ExchangeRatesApi;
import org.example.api.RandomSalaryApi;
import org.example.entity.Nalog;
import org.example.entity.Person;
import org.example.repository.PersonRepository;
import org.example.service.cache.PersonCache;
import org.example.utils.ConsoleUtils;
import org.example.utils.CurrencyUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;
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

        Person person = new Person();
        person.setFirstName(firstName);
        person.setSecondName(secondName);
        person.setPhoneNumber(number);

        PersonCache.getInstance().addPerson(person);
        personRepository.save(person);

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

        Person fakePerson = new Person();
        fakePerson.setFirstName(firstName);
        fakePerson.setSecondName(secondName);
        fakePerson.setPhoneNumber(number);

        PersonCache.getInstance().addPerson(fakePerson);
        personRepository.save(fakePerson);

        return fakePerson;
    }

    private String generateRandomFirstName() {
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
