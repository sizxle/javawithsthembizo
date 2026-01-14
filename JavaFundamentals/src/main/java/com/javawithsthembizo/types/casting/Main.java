package com.javawithsthembizo.types.casting;

public class Main {

    public static void main(String[] args) {
        //implicit casting
        byte age=30;
        int newAge= age+1;
        System.out.println(newAge);

        //explicit casting
        String x= "1.1";
        int result= (int)Double.parseDouble(x) + 2;
        System.out.println(result);
    }
}
