package com.kaala.sort;

/**
 * Created by kaala on 6/12/16.
 */
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
}
