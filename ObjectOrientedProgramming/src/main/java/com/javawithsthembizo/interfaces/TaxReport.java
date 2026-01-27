package com.javawithsthembizo.interfaces;

public class TaxReport {

    // Tax report is tightly coupled tu tax Calculator
    private TaxCalculator2026 taxCalculator;

    public TaxReport() {
        this.taxCalculator =  new TaxCalculator2026(100_000);
    }

    public void show(){
        var tax = taxCalculator.calculateTax();
        System.out.println(tax);
    }
}
