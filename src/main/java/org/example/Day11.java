package org.example;

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Day11 {
    public static void day11() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        // Reading the input array
        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();

        // Calculate and print the maximum hourglass sum
        int maxSum = maxHourglassSum(arr);
        System.out.println(maxSum);
    }

    public static int maxHourglassSum(List<List<Integer>> arr) {
        int maxSum = Integer.MIN_VALUE; // Initialize to the smallest possible integer

        for (int i = 0; i < 4; i++) { // Rows from 0 to 3
            for (int j = 0; j < 4; j++) { // Columns from 0 to 3
                // Calculate hourglass sum
                int hourglassSum = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2)
                        + arr.get(i + 1).get(j + 1)
                        + arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);

                // Update maxSum if current hourglassSum is greater
                if (hourglassSum > maxSum) {
                    maxSum = hourglassSum;
                }
            }
        }

        return maxSum;
    }
}