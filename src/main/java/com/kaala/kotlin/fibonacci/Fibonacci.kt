package com.kaala.kotlin.fibonacci

import com.kaala.kotlin.prime.isPrimeNaive

/**
 * @author Binod Shrestha <binodshrestha@lftechnology.com> on 5/27/17.
 */

fun fibRecur(num: Int): Long {
    if ( num <= 1 ) return num.toLong();

    return fibRecur(num-1) + fibRecur(num -2);
}

fun fibIterative(num: Int): Long {
    if ( num <= 1) return num.toLong()

    var a = 0L
    var b = 1L

    (2..num).forEach {
        val temp = a
        a = b
        b += temp
    }

    return b
}

fun main(args: Array<String>) {
    val start = System.nanoTime()
    println(fibRecur(50))

    val elapsedTime = System.nanoTime() - start

    println(elapsedTime)
}

//12586269025
//61 690 153 968