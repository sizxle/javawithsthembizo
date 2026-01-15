package com.javawithsthembizo.controlflow.project;

import java.text.NumberFormat;
import java.util.Scanner;

public class LoanCalculator {

    public static void main(String[] args) {

        final byte MONTHS_IN_A_YEAR=12;
        final byte PERCENT=100;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principle (R1k-R1M :");
        double principle=scanner.nextDouble();
        while(principle<1000 || principle>1_000_000){
            System.out.println("Enter a number between R1000 and R1 000 000.");
            System.out.print("Principle (R1k-R1M):");
            principle = scanner.nextDouble();
        }

        System.out.print("Annual Interest Rate :");
        float annualInterestRate= scanner.nextFloat();
        while(annualInterestRate<=0 || annualInterestRate>30){
            System.out.println("Enter a value grater than 0 and less than or equals to 30.");
            System.out.print("Annual Interest Rate :");
            annualInterestRate = scanner.nextFloat();
        }


        System.out.print("Period (Years) :");
        short years = scanner.nextShort();
        while (years<1 || years>30){
            System.out.println("Enter a value between 1 and 30");
            System.out.print("Period (Years) :");
            years = scanner.nextShort();
        }



        short numberOfRepayments= (short)(years*MONTHS_IN_A_YEAR);
        float monthlyInterest= annualInterestRate/PERCENT/MONTHS_IN_A_YEAR;
        double futureValueFactor= Math.pow(1+monthlyInterest,numberOfRepayments);
        double repayments= (principle*monthlyInterest*futureValueFactor)/(futureValueFactor-1);

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println("Repayment: "+ currency.format(repayments));


    }
}
