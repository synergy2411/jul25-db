package com.sk.wrapper_classes;

public class BiNumberRunner {
    public static void main(String[] args) {

        BiNumber biNumber = new BiNumber(3,4);
        Integer addResult = biNumber.add();
        System.out.println("Add : " + addResult);
        Integer multiplyResult = biNumber.multiply();
        System.out.println("Multiply Result : " + multiplyResult);
        biNumber.doubleValue();
        Integer firstNumber = biNumber.getFirstNumber();
        Integer secondNumber =  biNumber.getSecondNumber();
        System.out.println("First Number : " + firstNumber);
        System.out.println("Second Number : " + secondNumber);


    }
}
