package com.ComplexCalculator

import java.util.*

class StandardDeviation {
    fun standardDeviation() {
        val sc = Scanner(System.`in`)
        val obj = Summation()
        println("\n\nStandard Deviation\n\n\ntotal number of input to calculate Standard deviation")
        val s: Int = sc.nextInt()
        val a = DoubleArray(s)
        val b = DoubleArray(s)
        val c = DoubleArray(s)
        println("Enter the inputs to calculate Standard Deviation ")
        for (i in 0 until s) {
            print((i + 1).toString() + "th Number:\t")
            a[i] = sc.nextDouble()
        }
        val v = obj.Sum1(a, s) / s
        println(" value of mod X is:\t$v")
        println(" value of mod X is:\t$v")
        for (i in 0 until s) {
            b[i] = a[i] - v
        }
        for (i in 0 until s) {
            c[i] = Math.pow(b[i], 2.0)
        }
        val v1 = obj.Sum1(c, s) / s
        println(
            """

 The Standard Deviation is:

		 s.d=${Math.sqrt(v1)}"""
        )
    }
}