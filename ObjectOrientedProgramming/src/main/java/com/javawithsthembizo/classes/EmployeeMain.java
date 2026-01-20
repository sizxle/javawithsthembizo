package com.javawithsthembizo.classes;

public class EmployeeMain {

    public static void main(String[] args) {
        var employee= new Employee();
        employee.hourlyRate=10;
        employee.baseSalary=50_000;

        int wage=employee.calculateWage(30);

        System.out.println(wage);
    }
}
