package com.kaala.java.prime;

import java.util.stream.IntStream;

/**
 * @author Binod Shrestha <binodshrestha@lftechnology.com> on 5/18/17.
 */
public class Prime {

    private static boolean isPrimeNaive(Integer num) {
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    private static boolean isPrimeNaiveStream(final Integer num) {
        return IntStream.range(2, num/2).noneMatch(i -> num%i == 0);
    }

    public static void main(String[] args) {
        System.out.println(isPrimeNaiveStream(7));
    }

}
