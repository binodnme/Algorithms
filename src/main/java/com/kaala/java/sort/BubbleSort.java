package com.kaala.java.sort;

import java.util.Arrays;
import java.util.List;

/**
 * @author kaala on 8/22/16.
 */
public class BubbleSort {
    public static List<Integer> sort(List<Integer> array) {

        int temp;
        for (int i = 1; i < array.size(); i++) {
            for (int j = 0; j < array.size() - i; j++) {
                if (array.get(j) > array.get(j + 1)) {
                    temp = array.get(j);
                    array.set(j, array.get(j + 1));
                    array.set(j + 1, temp);
                }
            }
        }

        return array;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(6, 2, 4, 1, 8);
        System.out.println(sort(list));
    }
}
