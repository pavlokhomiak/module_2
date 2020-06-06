package com.pavlokhomiak.task3;

public class App3 {
    public static int[] array = {0,76,3,7,5,5};

    public static void main(String[] args) {
        System.out.println(findDuplicate());
    }

    public static boolean findDuplicate() {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) return true;
            }
        }
        return false;
    }


}
