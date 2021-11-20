package com.ComplexCalculator

fun main() {
    println(
        " 1.For Mean Deviation Calculator Press : 1(one)\n2.For Standard Deviation Calculation press : 2(two)")
    println(
        "\n3.For Covariance calculation press :3(three)\n4.For Mean Value calculation in Tabular From and Class Interval press:4(Four) ")
    println(
        "\n5.For Normal or simple Arithmetic Mean press: 5(five)\n6.For Fitting Geometric Curve Table press: 6(six)")
    println(
        "\n7.For Fitting Straight Line press :7(seven)\n8.For Fitting ParaBola press: 8(Eight)\n9.For Fitting Exponential curve press: 9(Nine) ")
    println(
        "\n10.For Correlation coefficient press:10(Ten)\n11.For regression y on x press 11(Eleven)\n 12.For regression x on y press 12(Twelve)")
    println("13.For rank press 13 or >13")
    println("\nplease enter a number to continue....")

    var s : String? = readLine()
    when(s){
        "1" ->  MeanDeviation().meanDeviation()
        "2" ->  StandardDeviation().standardDeviation()
        "3" ->  Covariance().covariance1()
        "4" ->  MeanValueCalculatorClassInterval().meanValueCalculatorClassInterval()
        "5" ->  SimpleArithmeticMean().simpleArithmeticMean()
        "6" ->  FittingGeometricCurve().fittingGeometricCurve()
        "7" ->  FittingStraightLine().fittingStraightLine()
        "8" ->  FittingParaBola().fittingParaBola()
        "9" ->  FittingExponentialCurve().FittingExponentialCurve1()
        "10"->  CorrelationCoefficient().correlationCoefficient1()
        "11"->  RegressionYx().regressionYx()
        "12"->  RegressionXy().regressionXy()
        else ->  NormalRank().normalRank()

    }
    println("\n\n\n\n\n\t\t\t\tThank You\t\t\t\t\n\n\n")

}