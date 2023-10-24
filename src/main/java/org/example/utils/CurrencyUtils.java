package org.example.utils;

import org.example.api.ExchangeRatesApi;
import org.example.api.RandomSalaryApi;

public class CurrencyUtils {
    private ConsoleUtils consoleUtils = new ConsoleUtils();
    private RandomSalaryApi randomSalaryApi = new RandomSalaryApi();
    private ExchangeRatesApi exchangeRatesApi = new ExchangeRatesApi();

    public String receiveEurSalary() {
        int min = consoleUtils.getMinFromConsole();
        int max = consoleUtils.getMaxFromConsole();
        int count = consoleUtils.getCountFromConsole();
        String salaryInEur = randomSalaryApi.getRandomSalary(min, max, count).replaceAll("\\[|\\]", "");
        return salaryInEur;
    }

    public String calculateRubSalary(String salaryInEUR) {
        double eurToRubRate = exchangeRatesApi.receiveEurToRubRate();
        double salaryInEurValue = Double.parseDouble(salaryInEUR);
        double salaryInRubles = salaryInEurValue * eurToRubRate;
        return String.valueOf(salaryInRubles);
    }

    public String calculateIrrSalary(String salaryInEur) {
        double eurToIrrRate = exchangeRatesApi.receiveEurToIrrRate();
        double salaryInIRRValue = Double.parseDouble(salaryInEur);
        double salaryInIrr = salaryInIRRValue * eurToIrrRate;
        return String.valueOf(salaryInIrr);
    }

    public String calculateFkpSalary(String salaryEur) {
        double eutToFkpRate = exchangeRatesApi.receiveEurToFkpRate();
        double salaryInFkpValue = Double.parseDouble(salaryEur);
        double salaryInFkp = salaryInFkpValue * eutToFkpRate;
        return String.valueOf(salaryInFkp);
    }
}