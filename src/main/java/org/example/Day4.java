package org.example;


import java.util.Scanner;

//would be called Solution
public class Day4 {
    private int age;

    public Day4(int initialAge) {
        if (initialAge >= 0) {
            this.age = initialAge;
        } else {
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
    }

    static void day4() {
        Scanner scanner = new Scanner(System.in);
        int testCounter = scanner.nextInt();
        for (int i = 0; i < testCounter; i++) {
            int initialAge = scanner.nextInt();
            Day4 person = new Day4(initialAge);
            person.amIOld();
            for (int j = 0; j < 3; j++) {
                person.yearPasses();
            }
            person.amIOld();
            System.out.println();
        }
        scanner.close();
    }

    void yearPasses() {
        age++;
    }

    void amIOld() {
        if (age < 13) {
            System.out.println("You are young.");
        } else if (age < 18) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
        }
    }
}
