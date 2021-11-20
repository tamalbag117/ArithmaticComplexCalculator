package com.ComplexCalculator

import java.util.*

class FittingExponentialCurve {
    fun FittingExponentialCurve1() {
        val sc = Scanner(System.`in`)
        val obj = Summation()
        println("\n\n\n\t\t\tFitting Exponential curve\n\n\n")
        println("Total number of x and y present in the equation:")
        val s: Int = sc.nextInt()
        val a = DoubleArray(s)
        val b = DoubleArray(s)
        val c = DoubleArray(s)
        val d = DoubleArray(s)
        val e = DoubleArray(s)
        println("\n\nValues of x and y  in the given equation is:")
        for (i in 0 until s) {
            println("The value of x for column no." + (i + 1))
            a[i] = sc.nextDouble()
            println(" the value of y for column no." + (i + 1))
            b[i] = sc.nextDouble()
        }
        for (i in 0 until s) {
            c[i] = Math.log10(b[i])
            d[i] = Math.pow(a[i], 2.0)
            e[i] = Math.log10(b[i]) * a[i]
        }
        println("\n\n\nso the table is:\n\n\n")
        println("\t\t\t\t\tx\t\t\ty\t\t\tlog y\t\t\tx^2\t\t\tx*y")
        for (i in 0 until s) {
            println(
                " in column no." + (i + 1) + "\t\t" + a[i] + "\t-\t" + b[i] + "\t\t" + c[i] + "\t\t"
                        + d[i] + "\t\t" + e[i] + "\t\t\t\n\n"
            )
        }
        println(
            "_______________________________________________________________________________________________________________________________"
        )
        println(
            ("\t\t\t\t∑x=" + obj.Sum1(a, s) + "\t∑y=" + obj.Sum1(b, s) + "\t ∑Y=log y=" + obj.Sum1(c, s)
                    + "\t∑(X)^2=" + obj.Sum1(d, s) + "\t∑X*log y=" + obj.Sum1(e, s))
        )
        println("\n\nsum of x is ∑x=\t" + obj.Sum1(a, s))
        println("\n\nsum of y is ∑y=\t" + obj.Sum1(b, s))
        println("\n\nsum of  ∑Y=log y=\t" + obj.Sum1(c, s))
        println("\n\nsum of  ∑(X)^2=\t" + obj.Sum1(d, s))
        println("\n\nsum of  ∑X*log y=\t" + obj.Sum1(e, s))
        val g = arrayOf(doubleArrayOf(s.toDouble(), obj.Sum1(a, s)), doubleArrayOf(obj.Sum1(a, s), obj.Sum1(d, s)))
        val cc = (g[0][0] * g[1][1]) - (g[0][1] * g[1][0])
        val cc1 = 1 / cc
        val h =
            arrayOf(doubleArrayOf((g[1][1] * cc1), (-g[0][1] * cc1)), doubleArrayOf((-g[1][0] * cc1), (g[0][0] * cc1)))
        val h1 = (h[0][0] * obj.Sum1(c, s)) + (h[0][1] * obj.Sum1(e, s))
        val h2 = (h[1][0] * obj.Sum1(c, s)) + (h[1][1] * obj.Sum1(e, s))
        println("here \t\tA:\t$h1\t\t\tB:\t$h2")
        println("anti log of A is:\t" + Math.pow(10.0, h1) + "\tAnti log of B is:\t" + Math.pow(10.0, h2))
        println(
            ("\t \n\n \t\t The Fitting Exponential  curve equation is:\n\n\t\t\ty=\t" + Math.pow(10.0, h1)
                    + "(" + Math.pow(10.0, h2) + ")^x")
        )
    }
}