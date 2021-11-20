package com.ComplexCalculator

import java.util.*

class Covariance {
    fun covariance1() {
        val sc = Scanner(System.`in`)
        val obj = Summation()
        println("\n\n\t\tMeasures of Central Tendency\t\n\nTopic:\tCalculate Covariance\n\n")
        println("Total number of class interval present in the equation:")
        val s: Int = sc.nextInt()
        val a = DoubleArray(s)
        val b = DoubleArray(s)
        val c = DoubleArray(s)
        val d = DoubleArray(s)
        val e = DoubleArray(s)
        val f = DoubleArray(s)
        val g = DoubleArray(s)
        val h = DoubleArray(s)
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
        for (i in 0 until s) {
            println(
                " in column no." + (i + 1) + "F(y)^2=frequency*(y)^2 in " + a[i] + "-" + b[i]
                        + " interval class is"
            )
            g[i] = f[i] * Math.pow(d[i], 2.0)
            println(e[i])
            h[i] = f[i] * c[i]
        }
        println("\n\n\nso the table is:\n\n\n")
        println(
            ("\t\t\t\t\t x\t\ty\t\tfrequency\t\tMid value\t\ty=(x" + cc + ")/" + dd
                    + "\t\tFrequency*y\t\tfrequency*y^2")
        )
        for (i in 0 until s) {
            println(
                (" in column no." + (i + 1) + "\t\t" + a[i] + "\t-\t" + b[i] + "\t\t" + f[i] + "\t\t"
                        + c[i] + "\t\t" + d[i] + "\t\t" + e[i] + "\t\t" + g[i] + "\t\t\n\n")
            )
        }
        val aa = obj.Sum1(f, s)
        println("\n\nThe mean is:\t" + obj.Sum1(h, s) / obj.Sum1(f, s))
        val `var` = (obj.Sum1(g, s) / aa) - Math.pow(obj.Sum1(e, s) / aa, 2.0)
        println("\n\n Standard Deviation :\t\t" + Math.sqrt(`var`))
        println("\n\n σx(sigma x)=\t" + dd + "X" + Math.sqrt(`var`) + "\t=\t" + (dd * Math.sqrt(`var`)))
        println(
            ("\n\nnow Let's calculate covariance!\n\n covariance(C.V)=\t"
                    + 100 * (dd * Math.sqrt(`var`)) / (obj.Sum1(h, s) / obj.Sum1(f, s)))
        )
    }
}