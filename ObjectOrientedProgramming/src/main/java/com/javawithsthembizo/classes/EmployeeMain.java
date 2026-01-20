package com.javawithsthembizo.classes;

public class EmployeeMain {

    public static void main(String[] args) {
        var employee= new Employee();
        employee.setBaseSalary(50000);
        employee.setHourlyRate(10);
        int wage=employee.calculateWage(30);
        System.out.println(wage);
    }
}
