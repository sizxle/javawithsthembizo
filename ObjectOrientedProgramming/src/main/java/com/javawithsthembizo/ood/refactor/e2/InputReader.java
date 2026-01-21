package com.javawithsthembizo.ood.refactor.e2;

import java.util.Scanner;

public class InputReader {
    // we only have a single Console to work with here both methods are static
    private static Scanner scanner = new Scanner(System.in);

    public static double readNumber(String prompt, int min, int max) {
        do {
            System.out.print(prompt);
            double number = scanner.nextDouble();
            if (number >= min && number <= max)
                return number;
            System.out.println("Enter a value between "+min +" and "+ max+".");
        } while (true);
    }

    public static double readNumber(String prompt) {
        return scanner.nextDouble();
    }

}
