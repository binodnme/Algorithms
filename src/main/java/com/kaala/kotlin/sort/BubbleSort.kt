package com.kaala.kotlin.sort

/**
 * @author Binod Shrestha <binodshrestha@lftechnology.com> on 5/27/17.
 */

fun bubbleSort(array: IntArray): IntArray {
    var temp: Int
    (1..array.size - 1).forEach {
        i ->
        (0..array.size - i - 1).forEach {
            j ->
            if (array.get(j) > array[j + 1]) {
                temp = array[j]
                array[j] = array.get(j + 1)
                array[j + 1] = temp
            }

        }
    }

    return array
}

fun main(args: Array<String>) {
    bubbleSort(intArrayOf(6, 2, 4, 1, 8, 0, 23, 12, 45)).forEach { println(it) }
}