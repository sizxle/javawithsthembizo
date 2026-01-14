package com.javawithsthembizo.types.project;

import java.text.NumberFormat;
import java.util.Scanner;

public class LoanCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principle :");
        double principle=scanner.nextDouble();
        System.out.print("Annual Interest Rate :");
        float annualInterestRate= scanner.nextFloat();
        System.out.print("Period (Years) :");
        short years = scanner.nextShort();


        short numberOfRepayments= (short)(years*12);
        float monthlyInterest= annualInterestRate/100/12;
        double futureValueFactor= Math.pow(1+monthlyInterest,numberOfRepayments);
        double repayments= (principle*monthlyInterest*futureValueFactor)/(futureValueFactor-1);

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println("Repayment: "+ currency.format(repayments));


    }
}
