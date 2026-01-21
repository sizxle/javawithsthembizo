package com.javawithsthembizo.ood.refactor.e1;

import java.util.Scanner;

public class InputReader {

    private String prompt;
    private int min;
    private int max;


    public InputReader(String prompt, int min, int max) {
        this.prompt = prompt;
        this.min = min;
        this.max = max;
    }

    public double readNumber(){
        var scanner = new Scanner(System.in);
        do{
            System.out.print(prompt);
            var number = scanner.nextDouble();
            if(number>=min && number<=max)
                return number;
            System.out.println("Enter a value between "+min +" and "+ max+".");
        }while (true);
    }
}
