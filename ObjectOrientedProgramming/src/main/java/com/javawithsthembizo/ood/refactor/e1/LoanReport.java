package com.javawithsthembizo.ood.refactor.e1;

import java.text.NumberFormat;

public class LoanReport {

    private LoanCalculator loanCalculator;
    private final NumberFormat currency = NumberFormat.getCurrencyInstance();

    public LoanReport(LoanCalculator loanCalculator) {
        this.loanCalculator = loanCalculator;
    }

    public void printMonthlyPayments(){
        var monthlyPayment = loanCalculator.calculateMonthlyPayments();
        System.out.println("LOAN CALCULATOR");
        System.out.println("_______________");
        System.out.println("Repayment: "+ currency.format(monthlyPayment));
    }

    public void printStatement(){
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("________________");
        for (int month = 1; month <=loanCalculator.getYears()*LoanCalculator.MONTHS_IN_A_YEAR; month++) {
            double balance =loanCalculator.calculateBalance(month);
            System.out.println(currency.format(balance));
        }
    }
}
