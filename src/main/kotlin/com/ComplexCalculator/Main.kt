package com.ComplexCalculator

fun main() {
    println(
        """
        1.For Mean Deviation Calculator Press : 1(one)
        2.For Standard Deviation Calculation press : 2(two)
        3.For Covariance calculation press :3(three)
        4.For Mean Value calculation in Tabular From and Class Interval press:4(Four)
        5.For Normal or simple Arithmetic Mean press: 5(five)
        6.For Fitting Geometric Curve Table press: 6(six)
        7.For Fitting Straight Line press :7(seven)
        8.For Fitting ParaBola press: 8(Eight)
        9.For Fitting Exponential curve press: 9(Nine)
        10.For Correlation coefficient press:10(Ten)
        11.For regression y on x press 11(Eleven)
        12.For regression x on y press 12(Twelve)
        13.For rank press 13 or >13"
      please enter a number to continue....
      
         """
     )

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