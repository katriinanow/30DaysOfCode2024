package org.example;

import java.util.Scanner;

public class Day2 {
    static double mealCost;
    static double tipPercent;
    static double taxPercent;

    public static void calculateTotalCost (double mealCost, double tipPercent, double taxPercent) {
        Scanner scanner = new Scanner(System.in);
        mealCost = Double.parseDouble(scanner.nextLine());
        tipPercent = Double.parseDouble(scanner.nextLine());
        taxPercent = Double.parseDouble(scanner.nextLine());
        double cost = mealCost + (mealCost * tipPercent / 100) + (mealCost * taxPercent / 100);
        System.out.println(Math.round(cost));
    }
}
