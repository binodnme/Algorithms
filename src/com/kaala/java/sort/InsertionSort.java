package com.kaala.java.sort;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort {
    public static int[] sort(int[] array) {
        System.out.println("insertion sort started");
        for (int j = 1; j < array.length; j++) {
            int currentVal = array[j];
            int i = j - 1;
            while (i >= 0 && array[i] > currentVal) {
                array[i + 1] = array[i];
                i -= 1;
            }
            array[i + 1] = currentVal;
        }
        return array;
    }


    public static List<Integer> recursiveSort(List<Integer> array) {
        List<Integer> sorted = array.subList(0, 1);

        for (int i = 1; i < array.size(); i++) {
            System.out.println(sorted);
            Integer element = array.get(i);
            sorted = insert(element, sorted);
        }
        return sorted;
    }

    private static List<Integer> insert(Integer element, List<Integer> sorted) {
        List<Integer> sortedList = new ArrayList<>();

        if (sorted.size() == 0) {
            sortedList.add(element);
        } else if (element < sorted.get(0)) {
            sortedList.add(element);
            sortedList.addAll(1, sorted);
        } else {
            sortedList.add(sorted.get(0));
            sortedList.addAll(insert(element, sorted.subList(1, sorted.size())));
        }

        return sortedList;
    }
}
