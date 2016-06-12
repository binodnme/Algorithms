package com.kaala;

import com.kaala.sort.InsertionSort;

import java.util.Arrays;

/**
 * Created by kaala on 6/12/16.
 */
public class Main {
    public static void main(String[] args){
        int[] array = new int[]{2,4,5,1,8,10,7};
        System.out.println("input array : "+ Arrays.toString(array));
        int[] sortedArray =  InsertionSort.sort(array);
        System.out.println("output array : "+Arrays.toString(sortedArray));
    }
}
