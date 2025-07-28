package com.sk.advanced.functional_programming;

import java.util.function.IntBinaryOperator;

public class FunctionalProgrammingRunner {

    public static void main(String[] args) {

        MathsUtils addition = (int n1, int n2) -> n1 + n2;
        int additionResult = addition.operate(12, 23);
        System.out.println("Addition Result : " + additionResult);

        MathsUtils multiply = (int n1, int n2) -> n1 * n2;
        int multiplyResult = multiply.operate(10, 12);
        System.out.println("Multiply Result : " + multiplyResult);
    }
}

//SAM : Single Abstract Method

@FunctionalInterface
interface MathsUtils {
    int operate(int a, int b);
    default void doSomething(){
        System.out.println("Doing something...");
    }
}
