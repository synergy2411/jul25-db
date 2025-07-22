package com.sk.wrapper_classes;

public class BiNumber {
    private Integer firstNumber;
    private Integer secondNumber;

    public BiNumber(int first, int second) {
        firstNumber = first;
        secondNumber = second;
    }

    public Integer add() {
        return firstNumber + secondNumber;
    }

    public Integer multiply() {
        return firstNumber * secondNumber;
    }

    public void doubleValue() {
        this.firstNumber = this.firstNumber * 2;
        this.secondNumber *= 2;
    }

    public Integer getFirstNumber() {
        return this.firstNumber;

    }

    public Integer getSecondNumber() {
        return this.secondNumber;
    }
}
