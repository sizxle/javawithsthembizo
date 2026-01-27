package com.javawithsthembizo.interfaces;

public class Main {

    public static void main(String[] args) {

        var c = new TaxCalculator2026(100_000);
        var report = new TaxReport(c);

    }
}
