package com.javawithsthembizo;

public class Strings {

    public static void main (String [] args){

        String message ="I am learning to be the best";// string pool
        String message2= new String("I am learning to be the best"); // heap

        System.out.println(message == message2);
        //False - reference comparison
        // for it to be true, intern message2

        System.out.println(message.equals(message2));
        //True
        //uses value comparison
    }
}
