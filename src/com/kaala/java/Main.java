package com.kaala.java;

import com.kaala.java.sort.MergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        long start = System.nanoTime();

        int[] array = getRandomIntegers(30000000);
//        List<Integer> arrayList = getRandomIntegersList(10000000);

        //bubble sort
//        List<Integer> sortedArray = BubbleSort.sort(array);

        //insertion sort
//        int[] sortedArray = InsertionSort.sort(array);

        //merge sort
        int[] sortedArray =  MergeSort.sort(array);

        //quick sort
//        QuickSort.sort(arrayList);

        long elapsedTime = System.nanoTime() - start;
        System.out.println("elapsed time : "+elapsedTime/1000000000.0);
//        System.out.println("output array : "+Arrays.toString(sortedArray));

//        System.out.println("output array : "+sortedArray);
    }

    private static int[] getRandomIntegers(int size){
        int[] randomNumbers = new int[size];
        for (int i = 0; i<size; i++){
            randomNumbers[i] = ThreadLocalRandom.current().nextInt(0, 10000);
        }
        return randomNumbers;
    }

    private static List<Integer> getRandomIntegersList(int size){
        List<Integer> randomNumbers = new ArrayList<>();
        for (int i = 0; i<size; i++){
            randomNumbers.add(ThreadLocalRandom.current().nextInt(0, 10000));
        }
        return randomNumbers;
    }
}
