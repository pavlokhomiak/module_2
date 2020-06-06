package com.pavlokhomiak.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class IntegersPlayground {
    private final List<Integer> array = new ArrayList<>();

    public List showList() {
        return array;
    }

    public void add(Integer n) {
        ListIterator<Integer> listIterator = array.listIterator();
        while (listIterator.hasNext()) {
            listIterator.set(listIterator.next() + n);
        }
        array.add(n);
    }

    public void remove(Integer n) {
        if (array.contains(n)) {
            array.remove(n);
            ListIterator<Integer> listIterator = array.listIterator();
            while (listIterator.hasNext()) {
                listIterator.set(listIterator.next() - n);
            }
        } else {
            System.out.println("No such element");
        }


    }

    public void searchByValue(Integer n) {
        if (array.contains(n)) {
            System.out.println("Exist");
        } else {
            System.out.println("Not exist");
        }
    }

    public Integer searchByIndex(int i) {
        try {
            return array.get(i);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("No such index");
        }
        return 0;
    }

    public Integer findMax() {
        return array.stream()
                .mapToInt(x -> x)
                .max()
                .getAsInt();
    }

    public Integer findMin() {
        return array.stream()
                .mapToInt(x -> x)
                .min()
                .getAsInt();
    }

    public Integer findAverage() {
        return array.stream()
                .mapToInt(v -> v)
                .sum()/array.size();
    }
}
