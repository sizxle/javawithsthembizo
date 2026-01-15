package com.javawithsthembizo.cleancode.project;

import java.text.NumberFormat;
import java.util.Scanner;

public class LoanCalculator {

    final static byte MONTHS_IN_A_YEAR=12;
    final static byte PERCENT=100;

    public static void main(String[] args) {

        double principle = readNumber("Principle (R1k-R1M) :","Enter a number between R1000 and R1 000 000.",1000,1_000_000);
        float annualInterestRate = (float) readNumber("Annual Interest Rate :","Enter a value grater than 0 and less than or equals to 30.",1,30);
        short years =(short) readNumber("Period (Years) :","Enter a value between 1 and 30",1,30);

        statement(principle,years,annualInterestRate);
    }

    public static double calculateBalance(double principle, short years,float annualInterestRate, int numberOfPaymentsMade){
        short numberOfRepayments= (short)(years*MONTHS_IN_A_YEAR);
        float monthlyInterest= annualInterestRate/PERCENT/MONTHS_IN_A_YEAR;
        double futureValueFactor= Math.pow(1+monthlyInterest,numberOfRepayments);

        return principle*(futureValueFactor- Math.pow(1+monthlyInterest,numberOfPaymentsMade))/(futureValueFactor-1);
    }

    public static void statement(double principle, short years,float annualInterestRate){

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        double repayment = calculateMonthlyPayments(principle, annualInterestRate, years);

        System.out.println("LOAN CALCULATOR");
        System.out.println("_______________");
        System.out.println("Repayment: "+ currency.format(repayment));
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("________________");

        for (int month = 1; month <=years*MONTHS_IN_A_YEAR; month++) {
            double balance =calculateBalance(principle,years,annualInterestRate,month);
            System.out.println(currency.format(balance));
        }

    }

    public static double readNumber(String question, String errorMessage, int min, int max){
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print(question);
            double number = scanner.nextDouble();
            if(number>=min && number<=max)
                return number;
            System.out.println(errorMessage);
        }while(true);
    }

    public static double calculateMonthlyPayments(double principle, float annualInterestRate, short years){

        short numberOfRepayments= (short)(years*MONTHS_IN_A_YEAR);
        float monthlyInterest= annualInterestRate/PERCENT/MONTHS_IN_A_YEAR;
        double futureValueFactor= Math.pow(1+monthlyInterest,numberOfRepayments);

        return (principle*monthlyInterest*futureValueFactor)/(futureValueFactor-1);
    }
}

