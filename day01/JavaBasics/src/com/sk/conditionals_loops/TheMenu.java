package com.sk.conditionals_loops;

import java.util.Scanner;

public class TheMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter Second Number : ");
        int secondNumber = scanner.nextInt();

        System.out.println("Your Choice please - ");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Divide");
        System.out.println("4. Multiple");

        int choice = scanner.nextInt();
        System.out.println("Your Choice : " + choice);
//        Use Switch Statement to perform operation
    }

}
