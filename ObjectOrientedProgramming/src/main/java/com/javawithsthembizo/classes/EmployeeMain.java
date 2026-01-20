package com.javawithsthembizo.classes;

public class EmployeeMain {

    public static void main(String[] args) {
        var employee= new Employee(50_000,20);
        var employee2= new Employee(50_000);
        int wage=employee.calculateWage();
        Employee.printNumberOfEmployee();
        employee.printNumberOfEmployee();
        System.out.println(wage);

    }
}
