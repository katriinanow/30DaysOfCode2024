package org.example;

import java.util.Scanner;

public class Day5 {
    private static int number;

    public static void day5() {
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
