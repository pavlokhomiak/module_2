package com.pavlokhomiak.task2;

import java.util.Arrays;

public class App2var3 {
    static int[] arr = {3, 6, 9, 8, 5};
    public static void main(String[] args) {
        System.out.println(Arrays.toString(find(14)));
    }

    static int[] find(int sum) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) return new int[]{i, j};
            }
        }
        return null;
    }
}
