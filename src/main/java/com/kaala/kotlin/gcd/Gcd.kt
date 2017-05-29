package com.kaala.kotlin.gcd

/**
 * @author Binod Shrestha <binodshrestha@lftechnology.com> on 5/27/17.
 */

fun gcd(a: Long, b: Long): Long {
    if (b == 0L) return a else return gcd(b, a % b);
}

fun main(args: Array<String>) {
    println(gcd(3918848, 1653264))
}