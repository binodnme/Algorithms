package com.kaala.kotlin.prime

/**
 * @author Binod Shrestha <binodshrestha@lftechnology.com> on 5/27/17.
 */

fun isPrimeNaive(num: Int): Boolean {
    return (2..num / 2).none { n ->  num % n == 0 }
}

fun main(args: Array<String>) {
    val start = System.nanoTime()
    println(isPrimeNaive(7))
    val elapsedTime = System.nanoTime() - start

    println(elapsedTime)

}