package com.javawithsthembizo.classes;

public class Employee {

    private int baseSalary;
    private int hourlyRate;

    public static int numOfEmployees;


    public Employee(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numOfEmployees++;
    }

    public Employee(int baseSalary){
     this(baseSalary,0);
    }

    public int calculateWage(int extraHours){
        return baseSalary+(extraHours*getHourlyRate());
    }

    public int calculateWage(){
        return calculateWage(0);
    }

    private void setBaseSalary(int baseSalary){
        if(baseSalary <=0){
            throw new IllegalArgumentException("Salary cannot be 0 or less.");
        }
        this.baseSalary=baseSalary;
    }

    private int getBaseSalary(){
        return this.baseSalary;
    }

    private void setHourlyRate(int hourlyRate){
        if(hourlyRate<0){
            throw new IllegalArgumentException("Hourly rate cannot be 0 or less");
        }
        this.hourlyRate=hourlyRate;
    }

    private int getHourlyRate(){
        return this.hourlyRate;
    }

    public static void printNumberOfEmployee(){
        System.out.println(numOfEmployees);
    }


}
