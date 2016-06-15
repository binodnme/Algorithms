package com.kaala;

import com.kaala.sort.InsertionSort;
import com.kaala.sort.MergeSort;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by kaala on 6/12/16.
 */
public class Main {
    public static void main(String[] args){
//        int[] array = new int[]{2,4,5,1,8,10,7};
        int[] array = getRandomIntegers(1000000);
//        System.out.println("input array : "+ Arrays.toString(array));
        int[] sortedArray =  InsertionSort.sort(array);
        System.out.println("output array : "+Arrays.toString(sortedArray));
    }

    private static int[] getRandomIntegers(int size){
        int[] randomNumbers = new int[size];
        for (int i = 0; i<size; i++){
            randomNumbers[i] = ThreadLocalRandom.current().nextInt(0, 1000001);
        }
        return randomNumbers;
    }
}
