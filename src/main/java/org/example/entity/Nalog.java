package org.example.entity;



public class Nalog {
    private String nds = "20";
    private String ysn = "6";

    public Nalog(String nds, String ysn) {
        this.nds = nds;
        this.ysn = ysn;
    }

    public String calculateNetSalary(String salaryInEur) {
        double grossSalary = Double.parseDouble(salaryInEur);
        double ndsRate = Double.parseDouble(nds) / 100;
        double usnRate = Double.parseDouble(ysn) / 100;

        double ndsAmount = grossSalary * ndsRate;
        double usnAmount = grossSalary * usnRate;

        double netSalary = grossSalary - ndsAmount - usnAmount;

        return String.valueOf(netSalary);
    }
}