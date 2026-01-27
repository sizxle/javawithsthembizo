package com.javawithsthembizo.interfaces;

public class TaxCalculator {

    private double incomeTax;

    public TaxCalculator(double incomeTax) {
        this.incomeTax = incomeTax;
    }

    public double calculateTax(){
        return incomeTax*0.3;
    }
}
