package org.example;

import java.util.Scanner;

public class Day3 {
    static int number;

    public static void checkNumber() {
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        scanner.close();

        if (number % 2 == 0) {
            if ((number > 1 && number <= 5) || (number > 20)) {
                System.out.println("Not Weird");
            } else if (number >= 6 && number <= 20) {
                System.out.println("Weird");                
            }
        } else {
            System.out.println("Weird");
        }
    }
}
