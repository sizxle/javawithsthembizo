package com.javawithsthembizo.ood.refactor.e2;

public class Main {

    public static void main(String[] args) {

        double principle = InputReader.readNumber("Principle (R1k-R1M) :", 1000, 1_000_000);
        float annualInterestRate = (float) InputReader.readNumber("Annual Interest Rate :", 1, 30);
        short years = (short) InputReader.readNumber("Period (Years) :", 1, 30);

        var calculator = new LoanCalculator(principle,annualInterestRate,years);
        var report = new LoanReport(calculator);
        report.printMonthlyRepayments();
        report.printStatement();
    }


}
