package com.ComplexCalculator

import java.util.*

class MeanDeviation() {
    fun meanDeviation() {
        val sc = Scanner(System.`in`)
        val obj = Summation()
        println("total number of input in mean deviation")
        val s: Int = sc.nextInt()
        val a = DoubleArray(s)
        val b = DoubleArray(s)
        println("Enter the inputs to calculate Mean Deviation ")
        for (i in 0 until s) {
            print("no\t" + (i + 1) + "\tinput\t")
            a[i] = sc.nextDouble()
        }
        val v = obj.Sum1(a, s) / s
        println(" value of mod X is:\t$v")
        for (i in 0 until s) {
            b[i] = Math.abs(a[i] - v)
        }
        val v1 = obj.Sum1(b, s) / s
        println("\t\t\t Mean Deviation is:\t\t\t$v1")
    }
}