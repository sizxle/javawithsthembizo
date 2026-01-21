package com.javawithsthembizo.ood.refactor.e1;

import java.text.NumberFormat;

public class LoanReport {

    private double principle;
    private short years;
    private float annualInterestRate;

    private final static byte MONTHS_IN_A_YEAR = 12;
    private final static byte PERCENT = 100;

    public LoanReport(double principle, short years, float annualInterestRate) {
        this.principle = principle;
        this.years = years;
        this.annualInterestRate = annualInterestRate;
    }

    public double calculateBalance(int numberOfPaymentsMade){
        short numberOfRepayments= (short)(years*MONTHS_IN_A_YEAR);
        float monthlyInterest= annualInterestRate/PERCENT/MONTHS_IN_A_YEAR;
        double futureValueFactor= Math.pow(1+monthlyInterest,numberOfRepayments);

        return principle*(futureValueFactor- Math.pow(1+monthlyInterest,numberOfPaymentsMade))/(futureValueFactor-1);
    }

    public void printStatement(){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("________________");
        for (int month = 1; month <=years*MONTHS_IN_A_YEAR; month++) {
            double balance =calculateBalance(month);
            System.out.println(currency.format(balance));
        }
    }
}
