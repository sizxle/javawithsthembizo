package com.javawithsthembizo.interfaces;

public class TaxCalculator2026 implements TaxCalculator {

    private double incomeTax;

    public TaxCalculator2026(double incomeTax) {
        this.incomeTax = incomeTax;
    }

    @Override
    public double calculateTax(){
        return incomeTax*0.3;
    }
}
