package com.kaala.java.sort;

public class MergeSort {
    public static int[] sort(int[] array) {
        if (array.length == 1) {
            return array;
        } else {
            int left = array.length/2;
            int[] leftArray = new int[left];
            int[] rightArray = new int[array.length - left];
            System.arraycopy(array, 0, leftArray, 0, left);
            System.arraycopy(array, left, rightArray, 0, array.length - left);

            return combine(sort(leftArray), sort(rightArray));
        }
    }

    private static int[] combine(int[] sortedLeft, int[] sortedRight) {
        int resultSize = sortedLeft.length + sortedRight.length;
        int[] result = new int[resultSize];

        int index = -1;
        int i = 0;
        int j = 0;

        while ((i < sortedLeft.length) && (j < sortedRight.length)) {
            int leftValue = sortedLeft[i];
            int rightValue = sortedRight[j];

            index++;
            if (leftValue < rightValue) {
                i++;
                result[index] = leftValue;
            } else {
                j++;
                result[index] = rightValue;
            }
        }

        if (index < resultSize - 1) {
            if (i == sortedLeft.length) {
                System.arraycopy(sortedRight, j, result, ++index, sortedRight.length - j);
            } else if (j == sortedRight.length) {
                System.arraycopy(sortedLeft, i, result, ++index, sortedLeft.length - i);
            }
        }
        return result;
    }
}