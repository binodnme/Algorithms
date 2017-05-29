package com.kaala.java.fibonacci;

import java.util.stream.IntStream;

/**
 * Created by binodnme on 9/8/2016.
 */
public class FibonacciRecur {
    //returns fibonacci value recursively
    public static long fib(int n){
        if( n <= 1) return n;
        return fib(n-1) + fib(n-2);
    }

    //returns fibonacci value iteratively
    public static long fibNew(int n){
        if (n <= 1) return n;

        long a = 0;
        long b = 1;
        for (int i=2; i<=n; i++){
            long temp = a;
            a = b;
            b = temp+b;
        }

        return b;
    }

    public static void main(String[] args){
        long start = System.nanoTime();

        System.out.println(fib(50));

        long elapsedTime = System.nanoTime() - start;

        System.out.println(elapsedTime);

    }
}
