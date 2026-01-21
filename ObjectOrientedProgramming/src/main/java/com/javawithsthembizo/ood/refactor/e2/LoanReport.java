package com.javawithsthembizo.ood.refactor.e2;

import java.text.NumberFormat;

public class LoanReport {

    private LoanCalculator loanCalculator;
    private final NumberFormat currency;

    public LoanReport(LoanCalculator loanCalculator) {
        this.loanCalculator = loanCalculator;
        this.currency=NumberFormat.getCurrencyInstance();
    }

    public void printMonthlyRepayments() {
        double repayment = loanCalculator.calculateMonthlyPayments();
        System.out.println();
        System.out.println("LOAN CALCULATOR");
        System.out.println("_______________");
        System.out.println("Repayment: " + currency.format(repayment));
    }

    public void printStatement() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("________________");
        for(double balance : loanCalculator.getRemainingBalances()){
            System.out.println(currency.format(balance));
        }
    }
}
