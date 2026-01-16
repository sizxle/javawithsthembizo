package com.javawithsthembizo.debugging;

public class Main {

    public static void main(String[] args) {
        System.out.println("START");
        printNumbers(4);
        System.out.println("FINISH");
    }

    public static void printNumbers(int limit){
        for (int i = 0; i < limit; i+=2) {
            System.out.println(i);
        }
    }
}
