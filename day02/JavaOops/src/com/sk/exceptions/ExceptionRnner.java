package com.sk.exceptions;

public class ExceptionRnner {

    public static void printOne(int n1, int n2) {
        printTwo(n1, n2);
    }

    public static void printTwo(int a, int b) {
        double result = a / b;
        System.out.println("Divide Result : " + result);
    }

    private static void nullPointerExceptionMethod() throws NullPointerException {
        String greet = null;
        System.out.println("Uppercase : " + greet.toUpperCase());
    }

    private static void indexOutOfBoundsExceptionMethod() throws ArrayIndexOutOfBoundsException {

        String[] friends = {"Monica", "Ross"};

        System.out.println("Friends : " + friends[10]);

    }

    public static void main(String[] args) {
        printOne(10, 5);

        try {
            nullPointerExceptionMethod();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(" Finally Block in Null Pointer Exception");
        }

        try {
            indexOutOfBoundsExceptionMethod();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally inside Index Out Of Bounds");
        }
    }


}
