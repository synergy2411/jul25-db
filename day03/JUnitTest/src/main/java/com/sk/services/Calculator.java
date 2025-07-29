package com.sk.services;

public class Calculator {

    public static int addTwoNumbers(int a, int b){
        return a + b;
    }

    public static int addAllNumbers(int ...numbers){
        int sum = 0;
        for(int n: numbers){
            sum += n;
        }
        return sum;
    }

}
