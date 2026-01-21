package com.javawithsthembizo.ood.refactor.e1;

import java.text.NumberFormat;


public class Main {


    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        double principle= new InputReader("Principle (R1k-R1M) :",1000,1_000_000).readNumber();
        float annualInterestRate=(float) new InputReader("Annual Interest Rate :",1,30).readNumber();
        short years =(short) new InputReader("Period (Years) :",1,30).readNumber();

        var monthlyPayment = new LoanCalculator(principle,years,annualInterestRate).calculateMonthlyPayments();
        System.out.println("LOAN CALCULATOR");
        System.out.println("_______________");
        System.out.println("Repayment: "+ currency.format(monthlyPayment));

        new LoanReport(principle,years,annualInterestRate).printStatement();

    }

}
