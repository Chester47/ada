package org.example.utils;

public class CurrencyUtils {
    private int usdToRubRate;

    public CurrencyUtils(int usdToRubRate) {
        this.usdToRubRate = usdToRubRate;
    }

    public int calculateSalaryInRub(double salaryInUsd) {
        return (int) (salaryInUsd * usdToRubRate);
    }
}