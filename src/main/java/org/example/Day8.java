package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day8 {
    static int size;

    static void day8() {
        Scanner scanner = new Scanner(System.in);
        size = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> inputMap = new HashMap<>();
        for (int i = 0; i < size; i++) {
            inputMap.put(scanner.next(), scanner.nextInt());
        }
        while (scanner.hasNext()) {
            String searchedEntry = scanner.next();
            if (inputMap.containsKey(searchedEntry)) {
                System.out.println(searchedEntry + "=" + inputMap.get(searchedEntry));
            } else System.out.println("Not found");
        }
    }
}
