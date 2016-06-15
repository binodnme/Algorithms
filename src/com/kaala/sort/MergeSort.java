package com.kaala.sort;

import java.util.Arrays;

public class MergeSort {
    public static int[] sort(int[] array) {
        System.out.println("merge sort started");
        int p = 0;
        int q = array.length / 2 - 1;
        int r = array.length - 1;
        return mergeSort(array, p, q, r);
    }

    private static int[] mergeSort(int[] array, int p, int q, int r) {
        int[] leftArray = new int[q - p + 1];
        int[] rightArray = new int[r - q];
        System.arraycopy(array, 0, leftArray, 0, q - p + 1);
        System.arraycopy(array, q + 1, rightArray, 0, r - q);

        int[] resultLeft;
        int[] resultRight;

        if (leftArray.length > 1) {
            int pl = 0;
            int ql = leftArray.length / 2 - 1;
            int rl = leftArray.length - 1;
            resultLeft = mergeSort(leftArray, pl, ql, rl);
        } else {
            resultLeft = new int[]{leftArray[0]};
        }

        if (rightArray.length > 1) {
            int pr = 0;
            int qr = rightArray.length / 2 - 1;
            int rr = rightArray.length - 1;
            resultRight = mergeSort(rightArray, pr, qr, rr);
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
                for (; j < resultRight.length; j++) {
                    index++;
                    result[index] = resultRight[j];
                }
            } else if (j == resultRight.length) {
                for (; i < resultLeft.length; i++) {
                    index++;
                    result[index] = resultLeft[i];
                }
            }
        }
        return result;
    }
}
