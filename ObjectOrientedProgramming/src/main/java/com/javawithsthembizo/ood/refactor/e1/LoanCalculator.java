package com.javawithsthembizo.ood.refactor.e1;

import java.text.NumberFormat;
import java.util.Scanner;

public class LoanCalculator {

    private double principle;
    private short years;
    private float annualInterestRate;

    public final static byte MONTHS_IN_A_YEAR = 12;
    private final static byte PERCENT = 100;

    public LoanCalculator(double principle, short years, float annualInterestRate) {
        setPrinciple(principle);
        setYears(years);
        setAnnualInterestRate(annualInterestRate);

    }

    public void setPrinciple(double principle) {
        if (principle >= 1000 && principle <= 1_000_000) {
            this.principle = principle;

        } else {
            System.out.println("Enter a number between R1000 and R1 000 000.");
        }
    }

    public void setYears(short years) {
        if (years >= 1 && years <= 30) {
            this.years = years;
        } else {
            System.out.println("Enter a value between 1 and 30");
        }
    }

    public void setAnnualInterestRate(float annualInterestRate) {
        if (annualInterestRate >= 1 && annualInterestRate <= 30) {
            this.annualInterestRate = annualInterestRate;
        } else {
            System.out.println("Enter a value grater than 0 and less than or equals to 30");
        }
    }

    public double calculateMonthlyPayments() {
        short numberOfRepayments = (short) (years * MONTHS_IN_A_YEAR);
        float monthlyInterest = annualInterestRate / PERCENT / MONTHS_IN_A_YEAR;
        double futureValueFactor = Math.pow(1 + monthlyInterest, numberOfRepayments);

        return (principle * monthlyInterest * futureValueFactor) / (futureValueFactor - 1);
    }

    public double calculateBalance(int numberOfPaymentsMade){
        short numberOfRepayments= (short)(years*MONTHS_IN_A_YEAR);
        float monthlyInterest= annualInterestRate/PERCENT/MONTHS_IN_A_YEAR;
        double futureValueFactor= Math.pow(1+monthlyInterest,numberOfRepayments);

        return principle*(futureValueFactor- Math.pow(1+monthlyInterest,numberOfPaymentsMade))/(futureValueFactor-1);
    }

    public short getYears(){
        return years;
    }
}

