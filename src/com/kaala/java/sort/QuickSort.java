package com.kaala.java.sort;

import java.util.List;

/**
 * @author kaala on 8/26/16.
 */
public class QuickSort {

    public static void sort(List<Integer> array) {
        if (array.size() <= 1)
            return;

        int pivotElement = array.get(array.size() - 1);
        int leftIndex = 0;
        for (int i = 0; i < array.size(); i++) {
            int currentVal = array.get(i);
            if (pivotElement > currentVal) {
                //swap left and current index value
                array.set(i, array.get(leftIndex));
                array.set(leftIndex, currentVal);
                leftIndex++;
            }
        }
        //swap left and pivot element
        array.set(array.size() - 1, array.get(leftIndex));
        array.set(leftIndex, pivotElement);

        sort(array.subList(0, leftIndex));
        sort(array.subList(leftIndex + 1, array.size()));
    }
}
