package com.kaala.java.sort;

import java.util.List;

/**
 * @author kaala on 8/31/16.
 */
public class SelectionSort {
    public static void sort(List<Integer> array) {
        for (int i = 0; i < array.size() - 1; i++) {
            for (int j=i; j<array.size(); j++) {
                if(array.get(j) < array.get(i)) {
                    int temp = array.get(i);
                    array.set(i, array.get(j));
                    array.set(j, temp);
                }
            }
        }
    }
}
