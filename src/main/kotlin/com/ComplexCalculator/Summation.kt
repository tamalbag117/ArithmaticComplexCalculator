package com.ComplexCalculator

class Summation {
    fun Sum1(a: DoubleArray, s: Int): Double {
        var sum = 0.0
        for (i in 0 until s) {
            sum = sum + a[i]
        }
        return sum
    }
}
