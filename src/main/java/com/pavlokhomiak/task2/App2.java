package com.pavlokhomiak.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class App2 {
    public static int[] array = {3, 6, 9, 8, 5};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(find(17)));
    }

    public static int[] find(int sum) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            result.clear();
            result.add(i);
            if (sum - array[i] == 0) {
                return result.stream()
                        .mapToInt(x -> x)
                        .toArray();
            }
            for (int j = i; j < array.length; j++) {
                if (i == j) continue;
                result.clear();
                result.add(j);
                int subSum = array[i];
                subSum += array[j];
                if (sum - subSum == 0) {
                    result.add(i);
                    Collections.sort(result);
                    return result.stream()
                            .mapToInt(x -> x)
                            .toArray();
                }
                for (int k = j; k < array.length; k++) {
                    if (k == j) continue;
                    if (sum - subSum - array[k] == 0) {
                        result.add(i);
                        result.add(k);
                        Collections.sort(result);
                        return result.stream()
                                .mapToInt(x -> x)
                                .toArray();
                    }
                }
            }
        }
        /*
        return result.stream()
                .mapToInt(i -> i)
                .toArray();
         */
        return null;
    }
}
