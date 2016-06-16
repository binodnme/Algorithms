package com.kaala.java;

import com.kaala.java.sort.InsertionSort;
import com.kaala.java.sort.MergeSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        int[] array = getRandomIntegers(100000000);
        List<Integer> array = getRandomIntegersList(100000000);
//        System.out.println("input array : "+Arrays.toString(array));
        long start = System.nanoTime();
//        int[] sortedArray =  MergeSort.sort(array);
        Collections.sort(array);
        long elapsedTime = System.nanoTime() - start;
        System.out.println("elapsed time : "+elapsedTime/1000000000.0);
//        System.out.println("output array : "+Arrays.toString(sortedArray));
    }

    private static int[] getRandomIntegers(int size){
        int[] randomNumbers = new int[size];
        for (int i = 0; i<size; i++){
            randomNumbers[i] = ThreadLocalRandom.current().nextInt(0, 1000);
        }
        return randomNumbers;
    }

    private static List<Integer> getRandomIntegersList(int size){
        List<Integer> randomNumbers = new ArrayList<>();
        for (int i = 0; i<size; i++){
            randomNumbers.add(ThreadLocalRandom.current().nextInt(0, 20));
        }
        return randomNumbers;
    }
}
