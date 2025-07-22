package com.sk.big_decimal;

import java.math.BigDecimal;

public class BigDecimalRunner {

    public static void main(String[] args) {
        double d1 = 34.56789876;
        double d2 = 34.2234;
        double result = d1 + d2;
        System.out.println("Result : " + result);

//        Precised and Accurate values by Big Decimal
        BigDecimal bd1 = new BigDecimal("34.56789876");
        BigDecimal bd2 = new BigDecimal("34.2234");
        BigDecimal addResult = bd1.add(bd2);
        System.out.println("Big Decimal Add Result : " + addResult);


        BigDecimal principal = new BigDecimal("4500");
        BigDecimal rateOfInterest = new BigDecimal("7.5");
        BigDecimal years = new BigDecimal("5");

        SimpleInterestCalculator calculator = new SimpleInterestCalculator(principal, rateOfInterest);
        BigDecimal totalValue = calculator.calculateTotalValue(years);
        System.out.println("Total Amount : " + totalValue);
    }
}
