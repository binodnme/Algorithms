package com.kaala.java.prime;

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

    public static void main(String[] args) {
        if (isPrimeNaive(123456)) {
            System.out.println("done");
        }
    }

}
