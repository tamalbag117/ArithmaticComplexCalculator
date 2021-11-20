package com.ComplexCalculator

import java.util.*

class MeanValueCalculatorClassInterval {
    fun meanValueCalculatorClassInterval() {
        val sc = Scanner(System.`in`)
        val obj = Summation()
        println(
            "\n\n\t\tMeasures of Central Tendency\t\n\nTopic:\tClass interval and Mean Value calculation\n\n"
        )
        println("Total number of class interval present in the equation:")
        val s: Int = sc.nextInt()
        val a = DoubleArray(s)
        val b = DoubleArray(s)
        val c = DoubleArray(s)
        val d = DoubleArray(s)
        val e = DoubleArray(s)
        val f = DoubleArray(s)
        println("Enter the Class Interval :one by one ")
        for (i in 0 until s) {
            println("The value of Class interval for column no." + (i + 1))
            a[i] = sc.nextDouble()
            b[i] = sc.nextDouble()
            println("The frequency of The :" + a[i] + "-" + b[i] + " interval class is")
            f[i] = sc.nextDouble()
        }
        println("\n\nlet's find out the minvalue")
        for (i in 0 until s) {
            println(
                " in column no." + (i + 1) + "The mid value (X)of " + a[i] + "-" + b[i] + " interval class is"
            )
            c[i] = (b[i] + a[i]) / 2
            println(c[i])
        }
        val cc = c[s / 2]
        val dd = b[1] - a[1]
        println("Calculate the y for the table \t∵y=(x-c)/d\t")
        for (i in 0 until s) {
            println(
                " in column no." + (i + 1) + "The  value y in " + a[i] + "-" + b[i] + " interval class is"
            )
            d[i] = (c[i] - cc) / dd
            println(d[i])
        }
        for (i in 0 until s) {
            println(
                " in column no." + (i + 1) + "Fy=frequency*y in " + a[i] + "-" + b[i] + " interval class is"
            )
            e[i] = d[i] * f[i]
            println(e[i])
        }
        println("\n\n\nso the table is:\n\n\n")
        println("\t\t\t\tclass interval\t\t\tfrequency\t\tmid value\t\ty\t\tfrequency*y\t\t")
        for (i in 0 until s) {
            println(
                " in column no." + (i + 1) + "\t" + a[i] + "\t-\t" + b[i] + "\t\t" + f[i] + "\t\t" + c[i]
                        + "\t\t" + d[i] + "\t\t" + e[i] + "\t\t\t\n\n"
            )
        }
        println(
            "___________________________________________________________________________________________________________________________________________"
        )
        println("\t\t\t\t\t\t\t\t∑f=" + obj.Sum1(f, s) + "\t\t\t∑Fy=\t" + obj.Sum1(e, s))
        println("\n\nsum of frequency is ∑f=\t" + obj.Sum1(f, s))
        println("\n\nsum of x is frequency*y=\t∑Fy=\t" + obj.Sum1(e, s))
        println("\n\ncalculation\n\n x bar =$cc\t+$dd*y bar")
        println("the value of y bar is:" + obj.Sum1(e, s) / obj.Sum1(f, s))
        println("x bar=" + cc + "+\t" + dd + "(" + (obj.Sum1(e, s) / obj.Sum1(f, s)) + ")")
        val x = cc + dd * obj.Sum1(e, s) / obj.Sum1(f, s)
        println("\n\n The answer is:\n\t\t\t$x")
    }

}