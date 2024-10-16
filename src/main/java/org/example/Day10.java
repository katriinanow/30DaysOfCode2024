package org.example;

import java.util.Scanner;

public class Day10 {
    static int n;

    static void day10() {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        scanner.close();
        StringBuilder binary = calculateBinary(n);
        countConsecutiveOnes(binary);
    }

    static StringBuilder calculateBinary(int n) {
        StringBuilder binaryReversed = new StringBuilder();
        while (n > 0) {
            binaryReversed.append(n % 2);
            n /= 2;
        }
        return new StringBuilder(binaryReversed.reverse());
    }

    static void countConsecutiveOnes(StringBuilder binary) {
        int counter = 0;
        int max = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                counter++;
                if (counter > max) {
                    max = counter;
                }
            } else if (binary.charAt(i) == '0') {
                counter = 0;
            }
        }
        System.out.println(max);
    }

}
