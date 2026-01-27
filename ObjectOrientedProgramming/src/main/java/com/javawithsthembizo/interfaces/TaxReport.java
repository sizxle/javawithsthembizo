package com.javawithsthembizo.interfaces;

public class TaxReport {

    // Tax report is tightly coupled tu tax Calculator
    private TaxCalculator calculator;

    public TaxReport(TaxCalculator calculator) {
        this.calculator =  calculator;
    }

    public void show(){
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }

    public void setCalculator(TaxCalculator calculator) {
        this.calculator = calculator;
    }
}
