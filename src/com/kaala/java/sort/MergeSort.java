package com.kaala.java.sort;

public class MergeSort {
    public static int[] sort(int[] array) {
        int p = 0;
        int q = array.length / 2 - 1;
        int r = array.length - 1;

        int[] leftArray = new int[q - p + 1];
        int[] rightArray = new int[r - q];
        System.arraycopy(array, 0, leftArray, 0, q - p + 1);
        System.arraycopy(array, q + 1, rightArray, 0, r - q);

        int[] resultLeft;
        int[] resultRight;

        if (leftArray.length > 1) {
            resultLeft = sort(leftArray);
        } else {
            resultLeft = new int[]{leftArray[0]};
        }

        if (rightArray.length > 1) {
            resultRight = sort(rightArray);
        } else {
            resultRight = new int[]{rightArray[0]};
        }

        int resultSize = resultLeft.length + resultRight.length;
        int[] result = new int[resultSize];

        int index = -1;
        int i = 0;
        int j = 0;

        while ((i < resultLeft.length) && (j < resultRight.length)) {
            int leftValue = resultLeft[i];
            int rightValue = resultRight[j];

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
            if (i == resultLeft.length) {
                System.arraycopy(resultRight, j, result, ++index, resultRight.length - j);
            } else if (j == resultRight.length) {
                System.arraycopy(resultLeft, i, result, ++index, resultLeft.length - i);
            }
        }
        return result;
    }
}
