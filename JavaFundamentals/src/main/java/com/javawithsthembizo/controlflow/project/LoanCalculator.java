package com.javawithsthembizo.controlflow.project;

import java.text.NumberFormat;
import java.util.Scanner;

public class LoanCalculator {

    public static void main(String[] args) {

        final byte MONTHS_IN_A_YEAR=12;
        final byte PERCENT=100;
        Scanner scanner = new Scanner(System.in);

        double principle=0;
        float annualInterestRate= 0;
        short years = 0;

        do{
            System.out.print("Principle (R1k-R1M):");
            principle = scanner.nextDouble();
            if(principle>=1000 && principle<=1_000_000) {
                break;
            }
            System.out.println("Enter a number between R1000 and R1 000 000.");
        }while(true);

        do{
            System.out.print("Annual Interest Rate :");
            annualInterestRate = scanner.nextFloat();
            if(annualInterestRate>0 && annualInterestRate<=30) {
                break;
            }
            System.out.println("Enter a value grater than 0 and less than or equals to 30.");
        }while (true);


        do{
            System.out.print("Period (Years) :");
            years = scanner.nextShort();

            if(years>0 && years<=30)
                break;
            System.out.println("Enter a value between 1 and 30");
        }while (true);

        short numberOfRepayments= (short)(years*MONTHS_IN_A_YEAR);
        float monthlyInterest= annualInterestRate/PERCENT/MONTHS_IN_A_YEAR;
        double futureValueFactor= Math.pow(1+monthlyInterest,numberOfRepayments);
        double repayments= (principle*monthlyInterest*futureValueFactor)/(futureValueFactor-1);

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println("Repayment: "+ currency.format(repayments));


    }
}
