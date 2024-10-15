package org.example;

import java.util.Scanner;

public class Day9 {
    static int n;

    private static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else
            return n * factorial(n - 1);
    }

    static void day9() {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.println(factorial(n));
        scanner.close();
    }
}
