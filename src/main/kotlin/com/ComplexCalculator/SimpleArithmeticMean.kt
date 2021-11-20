package com.ComplexCalculator

import java.util.*

class SimpleArithmeticMean {
    fun simpleArithmeticMean() {
        val sc = Scanner(System.`in`)
        val obj = Summation()
        println("\n\nTotal number of class  present in the Arithmetic Mean equation:")
        val s: Int = sc.nextInt()
        val a = DoubleArray(s)
        val b = DoubleArray(s)
        val f = DoubleArray(s)
        for (i in 0 until s) {
            println("The  input value for Class  for column no." + (i + 1))
            a[i] = sc.nextDouble()
            println("The frequency of The :" + a[i] + " interval class is")
            f[i] = sc.nextDouble()
        }
        println("\n\n\n\t\t\t X \t\t\t\tfrequency")
        for (i in 0 until s) {
            println("\t\t\t" + a[i] + "\t\t\t" + f[i])
        }
        for (i in 0 until s) {
            b[i] = a[i] * f[i]
        }
        println("\t\t\t\tN=∑Fi=\t" + obj.Sum1(f, s))
        println("The Arithmetic Mean is:  X bar=\t" + obj.Sum1(b, s) / obj.Sum1(f, s))
    }
}