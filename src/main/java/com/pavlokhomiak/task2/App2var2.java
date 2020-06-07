package com.pavlokhomiak.task2;

import java.util.Arrays;

public class App2var2 {
    static int[] arr = {3, 6, 9, 8, 5};
    public static void main(String[] args) {
        System.out.println(Arrays.toString(find(14)));
    }

    static int[] find(int sum) {
        int[] sorted = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (sorted[i] == sum) return new int[]{i};
            sorted[i] = arr[i];
        }
        Arrays.sort(sorted);
        
        int i = 0;
        int j = sorted.length - 1;
        while (i != j) {
            if (sum == sorted[i] + sorted[j]) {
                for (int k = 0; k < arr.length; k++) {
                    if (arr[k] == sorted[i]) i = k;
                    if (arr[k] == sorted[j]) j = k;
                }
                return i > j ? new int[]{j, i} : new int[]{i, j};
            }
            if (sum >= sorted[i] + sorted[j]) {
                i++;
                continue;
            }
            if (sum <= sorted[i] + sorted[j]) {
                j--;
                continue;
            }
        }
        return null;
    }
}
