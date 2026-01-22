package com.javawithsthembizo.inheritance.comapringobjects;

public class Main {

    public static void main(String[] args) {
        var point1 = new Point(4,2);
        var point2= new Point(4,2);

        System.out.println(point1 == point2);//false
        System.out.println(point1.equals(point2));//true
    }
}
