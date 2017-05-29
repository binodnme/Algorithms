package com.kaala.java.gcd;

/**
 * Created by binodnme on 9/8/2016.
 */
public class Gcd {
    public static long gcd(long a, long b) {
        if( b == 0) return a;
        return gcd(b, a%b);
    }

    public static void main(String[] args) {
        System.out.println(gcd(3918848, 1653264));
    }
}
