package org.example;

import java.util.Scanner;

public class Day6 {
    private static StringBuilder inputString = new StringBuilder();

    static void day6() {
        Scanner scanner = new Scanner(System.in);
        int numberOfTests = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after nextInt()

        for (int j = 0; j < numberOfTests; j++) {
            inputString.append(scanner.nextLine());
            StringBuilder evenIndexed = new StringBuilder();
            StringBuilder oddIndexed = new StringBuilder();

            for (int i = 0; i < inputString.length(); i++) {
                if (i % 2 == 0) {
                    evenIndexed.append(inputString.charAt(i));
                } else {
                    oddIndexed.append(inputString.charAt(i));
                }
            }

            System.out.println(evenIndexed + " " + oddIndexed);

            inputString.setLength(0); // Reset inputString
        }

        scanner.close();
    }
}
