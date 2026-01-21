package com.javawithsthembizo.ood.refactor.e2;

import java.time.Year;

public class LoanCalculator {

    private final static byte MONTHS_IN_A_YEAR = 12;
    private final static byte PERCENT = 100;

    private double principle;
    private float annualInterestRate;
    private short years;

    public LoanCalculator(double principle, float annualInterestRate, short years) {
        this.principle = principle;
        this.annualInterestRate = annualInterestRate;
        this.years = years;
    }

    public double calculateBalance(int numberOfPaymentsMade) {
        short numberOfRepayments = getNumberOfRepayments();
        float monthlyInterest = getMonthlyInterest();
        double futureValueFactor = Math.pow(1 + monthlyInterest, numberOfRepayments);
        return principle * (futureValueFactor - Math.pow(1 + monthlyInterest, numberOfPaymentsMade)) / (futureValueFactor - 1);
    }

    public double calculateMonthlyPayments() {
        short numberOfRepayments = getNumberOfRepayments();
        float monthlyInterest = getMonthlyInterest();
        double futureValueFactor = Math.pow(1 + monthlyInterest, numberOfRepayments);
        return (principle * monthlyInterest * futureValueFactor) / (futureValueFactor - 1);
    }

    private short getNumberOfRepayments() {
        return (short) (years * MONTHS_IN_A_YEAR);
    }

    private float getMonthlyInterest() {
        return annualInterestRate / PERCENT / MONTHS_IN_A_YEAR;
    }

    public double[] getRemainingBalances() {
        double[] balances = new double[getNumberOfRepayments()];
        for (int month = 1; month <= balances.length; month++)
            balances[month - 1] = calculateBalance(month);
        return balances;
    }
}
