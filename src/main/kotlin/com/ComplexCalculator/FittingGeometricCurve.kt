package com.ComplexCalculator

import java.util.*

class FittingGeometricCurve constructor(){
    fun fittingGeometricCurve() {
        val sc = Scanner(System.`in`)
        val obj = Summation()
        println("\n\n\n\t\t\tFitting Geometric Curve Table\n\n\n")
        println("Total number of x and y present in the equation:")
        val s: Int = sc.nextInt()
        val a = DoubleArray(s)
        val b = DoubleArray(s)
        val c = DoubleArray(s)
        val d = DoubleArray(s)
        val e = DoubleArray(s)
        val f = DoubleArray(s)
        println("\n\nValues of x are in the given equation:")
        for (i in 0 until s) {
            println("The value of x for column no." + (i + 1))
            a[i] = sc.nextDouble()
        }
        println("\n\nValues of y are in the given equation:")
        for (i in 0 until s) {
            println("value of y for column no." + (i + 1))
            b[i] = sc.nextDouble()
        }
        println("\n\n value of  x, y,X=log x ,Y=log y, X^2=(log x)^2; and x*y is :")
        for (i in 0 until s) {
            d[i] = Math.log10(a[i])
            c[i] = Math.log10(b[i])
            e[i] = Math.pow(d[i], 2.0)
            f[i] = d[i] * Math.log10(b[i])
        }
        println("\n\n\nso the table is:\n\n\n")
        println("\t\t\tx\t\ty\t\tlog x\t\tlog y\t\t(log x)^2\t\tlog x *log y\t\t")
        for (i in 0 until s) {
            print(
                "\n\tcolumn no." + (i + 1) + "\t\t" + a[i] + "\t\t" + b[i] + "\t\t" + Math.log10(a[i])
                        + "\t\t" + Math.log10(b[i]) + "\t\t" + Math.pow(d[i], 2.0) + "\t\t" + d[i] * Math.log10(
                    b[i]
                ) + "\t\t\n\n"
            )
        }
        println(
            "______________________________________________________________________________________________________________________________________________"
        )
        println(
            ("\t\t\t\t∑x=" + obj.Sum1(a, s) + "\t∑y=" + obj.Sum1(b, s) + "\t∑X=" + obj.Sum1(d, s)
                    + "\t∑Y=" + obj.Sum1(c, s) + "\t∑X^2=" + obj.Sum1(e, s) + "\tXY=" + obj.Sum1(f, s))
        )
        println("\n\nsum of x is ∑x=\t" + obj.Sum1(a, s))
        println("\n\nsum of y is ∑y=\t" + obj.Sum1(b, s))
        println("\n\nsum of X=log x is ∑X=\t" + obj.Sum1(d, s))
        println("\n\nsum of Y=log y is ∑Y=\t" + obj.Sum1(c, s))
        println("\n\nsum of X^2=(log x)^2 is ∑X^2=\t" + obj.Sum1(e, s))
        println("\n\nsum of XY is :\t" + obj.Sum1(f, s))
        val g = arrayOf(doubleArrayOf(s.toDouble(), obj.Sum1(d, s)), doubleArrayOf(obj.Sum1(d, s), obj.Sum1(e, s)))
        val cc = (g[0][0] * g[1][1]) - (g[0][1] * g[1][0])
        val cc1 = 1 / cc
        val h =
            arrayOf(doubleArrayOf((g[1][1] * cc1), (-g[0][1] * cc1)), doubleArrayOf((-g[1][0] * cc1), (g[0][0] * cc1)))
        val h1 = (h[0][0] * obj.Sum1(c, s)) + (h[0][1] * obj.Sum1(f, s))
        val h2 = (h[1][0] * obj.Sum1(c, s)) + (h[1][1] * obj.Sum1(f, s))
        println("here \t\tA:\t$h1\t\t\tB:\t$h2")
        println("anti log of A is:\t" + Math.pow(10.0, h1) + "\tAnti log of B is:\t" + Math.pow(10.0, h2))
        println(
            "\t \n\n \t\t The Fitting Geometric curve equation is:\n\n\t\t\ty=\t" + Math.pow(10.0, h1) + "(x)^" + h2
        )
    }
}