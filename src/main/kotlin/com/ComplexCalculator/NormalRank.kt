package com.ComplexCalculator

import java.util.*

class NormalRank {
    fun normalRank() {
        val sc = Scanner(System.`in`)
        val obj = Summation()
        println("\n\n\t\tCorrelation and Regression\t\n\nTopic:\tRank\n\n")
        println("Total number of x,y present in the question?:")
        val s: Int = sc.nextInt()
        val a = DoubleArray(s)
        val b = DoubleArray(s)
        val c = DoubleArray(s)
        val d = DoubleArray(s)
        for (i in 0 until s) {
            println("The value of  x for column no." + (i + 1))
            a[i] = sc.nextDouble()
        }
        for (i in 0 until s) {
            println("The value of y for column no." + (i + 1))
            b[i] = sc.nextDouble()
        }
        for (i in 0 until s) {
            d[i] = a[i] - b[i]
            c[i] = Math.pow(d[i], 2.0)
        }
        println("\n\n\nso the table is:\n\n\n")
        println("\t\t\t\t\t\t\t\tX\t\t\tY\t\t\td=x-y\t\t\td^2xy")
        for (i in 0 until s) {
            println(
                " in column no." + (i + 1) + "\t" + a[i] + "\t\t" + b[i] + "\t\t" + d[i] + "\t\t" + c[i] + "\n\n"
            )
        }
        println(
            "___________________________________________________________________________________________________________________________________________"
        )
        println(
            "\t\t\t\t\t\t\t\t∑X=" + obj.Sum1(a, s) + "\t\t∑Y=\t" + obj.Sum1(b, s) + "∑d=\t"
                    + obj.Sum1(d, s) + "\t∑d^2=" + obj.Sum1(c, s)
        )
        val r = 1 - ((6 * obj.Sum1(c, s)) / ((Math.pow(s.toDouble(), 3.0) - s)))
        println("\n\n\n\t\t\tThe rank is\n\t\t\t\t R=\t$r")
    }
}