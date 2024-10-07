package org.example;

import java.util.Scanner;

public class Day1 {

    int i = 4;
    double d = 4.0;
    String s = "HackerRank ";

    public static void day1(int i, double d, String s) {
        Scanner scanner = new Scanner(System.in);
        int inputInt = Integer.parseInt(scanner.nextLine());
        double inputDouble = Double.parseDouble(scanner.nextLine());
        String inputString = scanner.nextLine();
        System.out.println(i + inputInt);
        System.out.printf("%.1f%n", d + inputDouble);
        System.out.println(s.concat(inputString));
    }

}
