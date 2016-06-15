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
        int[] array = getRandomIntegers(10000);
        System.out.println("input array : "+ Arrays.toString(array));
        long start = System.nanoTime();
        int[] sortedArray =  MergeSort.sort(array);
        long elapsedTime = System.nanoTime() - start;
        System.out.println("elapsed time : "+elapsedTime);
        System.out.println("output array : "+Arrays.toString(sortedArray));
    }

    private static int[] getRandomIntegers(int size){
        int[] randomNumbers = new int[size];
        for (int i = 0; i<size; i++){
            randomNumbers[i] = ThreadLocalRandom.current().nextInt(0, 10001);
        }
        return randomNumbers;
    }
}
