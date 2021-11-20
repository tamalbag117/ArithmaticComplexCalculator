package com.ComplexCalculator

import java.util.*

class FittingParaBola {
    fun fittingParaBola() {
        val sc = Scanner(System.`in`)
        val obj = Summation()
        println("\n\n\n\t\t\tFitting ParaBola\n\n\n")
        println("Total number of x and y present in the equation:")
        val s: Int = sc.nextInt()
        val a = DoubleArray(s)
        val b = DoubleArray(s)
        val c = DoubleArray(s)
        val d = DoubleArray(s)
        val e = DoubleArray(s)
        val f = DoubleArray(s)
        val g = DoubleArray(s)
        println("\n\nValues of x and y  in the given equation is:")
        for (i in 0 until s) {
            println("The value of x for column no." + (i + 1))
            a[i] = sc.nextDouble()
            println(" the value of y for column no." + (i + 1))
            b[i] = sc.nextDouble()
        }
        for (i in 0 until s) {
            c[i] = Math.pow(a[i], 2.0)
            d[i] = Math.pow(a[i], 3.0)
            e[i] = Math.pow(a[i], 4.0)
            f[i] = a[i] * b[i]
            g[i] = Math.pow(a[i], 2.0) * b[i]
        }
        println("\n\n\nso the table is:\n\n\n")
        println("\t\t\t\tx\t\t\ty\t\t\tx^2\t\t\tx^3\t\t\tx^4\t\t\tx*y\t\tx^2*y\t\t")
        for (i in 0 until s) {
            println(
                " in column no." + (i + 1) + "\t" + a[i] + "\t-\t" + b[i] + "\t\t" + c[i] + "\t\t" + d[i]
                        + "\t\t" + e[i] + "\t\t" + f[i] + "\t\t" + g[i] + "\t\t\n\n"
            )
        }
        println(
            "____________________________________________________________________________________________________________________________________________________"
        )
        println(
            ("\t\t\t\t∑x=" + obj.Sum1(a, s) + "\t∑y=" + obj.Sum1(b, s) + "\t∑X^2=" + obj.Sum1(c, s)
                    + "\t∑X^3=" + obj.Sum1(d, s) + "\t∑X^4=" + obj.Sum1(e, s) + "\t∑X*Y=\t" + obj.Sum1(f, s) + "\t∑X*Y="
                    + obj.Sum1(f, s))
        )
        println("\n\nsum of x is ∑x=\t" + obj.Sum1(a, s))
        println("\n\nsum of y is ∑y=\t" + obj.Sum1(b, s))
        println("\n\nsum of  ∑X^2=\t" + obj.Sum1(c, s))
        println("\n\nsum of  ∑X^3=\t" + obj.Sum1(d, s))
        println("\n\nsum of  ∑X^4=\t" + obj.Sum1(e, s))
        println("\n\nsum of  ∑X*Y=\t" + obj.Sum1(f, s))
        println("\n\nsum of  ∑X2*Y=\t" + obj.Sum1(g, s))
        val i = arrayOf(
            doubleArrayOf(s.toDouble(), obj.Sum1(a, s), obj.Sum1(c, s)),
            doubleArrayOf(obj.Sum1(a, s), obj.Sum1(c, s), obj.Sum1(d, s)),
            doubleArrayOf(obj.Sum1(c, s), obj.Sum1(d, s), obj.Sum1(e, s))
        )
        val m = (((i[0][0]) * ((i[1][1] * i[2][2]) - (i[1][2] * i[2][1]))
                - ((i[0][1]) * ((i[1][0] * i[2][2]) - (i[1][2] * i[2][0])))
                + ((i[0][2]) * ((i[1][0] * i[2][1]) - (i[1][1] * i[2][0])))))
        val j = arrayOf(
            doubleArrayOf(obj.Sum1(b, s), obj.Sum1(a, s), obj.Sum1(c, s)),
            doubleArrayOf(obj.Sum1(f, s), obj.Sum1(c, s), obj.Sum1(d, s)),
            doubleArrayOf(obj.Sum1(g, s), obj.Sum1(d, s), obj.Sum1(e, s))
        )
        val n = (((j[0][0]) * ((j[1][1] * j[2][2]) - (j[1][2] * j[2][1]))
                - ((j[0][1]) * ((j[1][0] * j[2][2]) - (j[1][2] * j[2][0])))
                + ((j[0][2]) * ((j[1][0] * j[2][1]) - (j[1][1] * j[2][0])))))
        val k = arrayOf(
            doubleArrayOf(s.toDouble(), obj.Sum1(b, s), obj.Sum1(c, s)),
            doubleArrayOf(obj.Sum1(a, s), obj.Sum1(f, s), obj.Sum1(d, s)),
            doubleArrayOf(obj.Sum1(c, s), obj.Sum1(g, s), obj.Sum1(e, s))
        )
        val o = (((k[0][0]) * ((k[1][1] * k[2][2]) - (k[1][2] * k[2][1]))
                - ((k[0][1]) * ((k[1][0] * k[2][2]) - (k[1][2] * k[2][0])))
                + ((k[0][2]) * ((k[1][0] * k[2][1]) - (k[1][1] * k[2][0])))))
        val l = arrayOf(
            doubleArrayOf(s.toDouble(), obj.Sum1(a, s), obj.Sum1(b, s)),
            doubleArrayOf(obj.Sum1(a, s), obj.Sum1(c, s), obj.Sum1(f, s)),
            doubleArrayOf(obj.Sum1(c, s), obj.Sum1(d, s), obj.Sum1(g, s))
        )
        val p = (((l[0][0]) * ((l[1][1] * l[2][2]) - (l[1][2] * l[2][1]))
                - ((l[0][1]) * ((l[1][0] * l[2][2]) - (l[1][2] * l[2][0])))
                + ((l[0][2]) * ((l[1][0] * l[2][1]) - (l[1][1] * l[2][0])))))
        println(
            ("The equation of Fitting ParaBola is: \n\t\t\t y=\t" + (n / m) + "\t+\t" + (o / m) + "x\t+"
                    + (p / m) + "x^2")
        )
    }
}