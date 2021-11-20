package com.ComplexCalculator

import java.util.*

class CorrelationCoefficient {
    fun correlationCoefficient1() {
        val sc = Scanner(System.`in`)
        val obj = Summation()
        println("\n\n\t\tCorrelation and Regression\t\n\nTopic:\tCalculate Correlation Coefficient\n\n")
        println("Total number of X,Y present in the equation:")
        val s: Int = sc.nextInt()
        val a = DoubleArray(s)
        val b = DoubleArray(s)
        val c = DoubleArray(s)
        val d = DoubleArray(s)
        val e = DoubleArray(s)
        val f = DoubleArray(s)
        val g = DoubleArray(s)
        for (i in 0 until s) {
            println("The value of  x for column no." + (i + 1))
            a[i] = sc.nextDouble()
        }
        for (i in 0 until s) {
            println("The value of y for column no." + (i + 1))
            b[i] = sc.nextDouble()
        }
        for (i in 0 until s) {
            c[i] = a[i] - Math.round(obj.Sum1(a, s))
            d[i] = b[i] - Math.round(obj.Sum1(b, s))
            e[i] = Math.pow(c[i], 2.0)
            f[i] = Math.pow(d[i], 2.0)
            g[i] = c[i] * d[i]
        }
        println("\n\n\nso the table is:\n\n\n")
        println(
            "\t\t\t\t\t\tX\t\tY\t\tx=X-" + Math.round(obj.Sum1(a, s)) + "\t\ty=Y-"
                    + Math.round(obj.Sum1(b, s)) + "\t\tx^2\t\ty^2\t\txy"
        )
        for (i in 0 until s) {
            println(
                (" in column no." + (i + 1) + "\t" + a[i] + "\t\t" + b[i] + "\t\t" + c[i] + "\t\t" + d[i]
                        + "\t\t" + e[i] + "\t\t" + f[i] + "\t\t" + g[i] + "\t\n\n")
            )
        }
        println(
            "___________________________________________________________________________________________________________________________________________"
        )
        println(
            ("\t\t\t\t\t\t\t\t∑X=" + obj.Sum1(a, s) + "\t\t∑Y=\t" + obj.Sum1(b, s) + "∑x=\t"
                    + obj.Sum1(c, s) + "\t∑y=" + obj.Sum1(d, s) + "\t∑x^2=" + obj.Sum1(e, s) + "∑y^2=" + obj.Sum1(f, s)
                    + "\t∑xy=" + obj.Sum1(g, s))
        )
        println("\n\nthe all sum in the table is:\n")
        println(
            ("\t∑X=" + obj.Sum1(a, s) + "\n∑Y=\t" + obj.Sum1(b, s) + "\n∑x=\t" + obj.Sum1(c, s) + "\n∑y="
                    + obj.Sum1(d, s) + "\n∑x^2=" + obj.Sum1(e, s) + "\n∑y^2=" + obj.Sum1(f, s) + "\n∑xy=" + obj.Sum1(
                g,
                s
            ))
        )
        println(
            "Standard deviation for x is:\t" + Math.sqrt((obj.Sum1(e, s) / s) - (Math.pow(obj.Sum1(c, s) / s, 2.0)))
        )
        println(
            "Standard deviation for y is:\t" + Math.sqrt((obj.Sum1(f, s) / s) - (Math.pow(obj.Sum1(d, s) / s, 2.0)))
        )
        val ff1 = Math.sqrt((obj.Sum1(e, s) / s) - (Math.pow(obj.Sum1(c, s) / s, 2.0)))
        val ff2 = Math.sqrt((obj.Sum1(f, s) / s) - (Math.pow(obj.Sum1(d, s) / s, 2.0)))
        val cov = ((obj.Sum1(g, s) / s) - ((obj.Sum1(c, s) / s) * (obj.Sum1(d, s) / s)))
        println("Covariance of x and y is \t cov(x,y):\t$cov")
        println(
            "\n\n\n The correlation coefficient is...\n\n r=cov(x,y)/s.d(x)*s.d(y)=\t" + ((cov) / (ff1 * ff2))
        )
    }
}