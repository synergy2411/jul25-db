package com.sk.big_decimal;

import java.math.BigDecimal;

public class SimpleInterestCalculator {

    private BigDecimal principal;
    private BigDecimal rateOfInterest;

    public SimpleInterestCalculator(BigDecimal principal, BigDecimal rateOfInterest){
        this.principal = principal;
        this.rateOfInterest = rateOfInterest;
    }

    public BigDecimal calculateTotalValue(BigDecimal years) {
        BigDecimal interest = principal.multiply(rateOfInterest).multiply(years)
                .divide(new BigDecimal("100"));
        return principal.add(interest);
    }
}
