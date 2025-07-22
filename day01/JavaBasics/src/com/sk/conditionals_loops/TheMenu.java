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

        switch (choice) {
            case 1: {
                System.out.println("The Result is : " + (firstNumber + secondNumber));
                break;
            }
            case 2: {
                System.out.println("The Result is : " + (firstNumber - secondNumber));
                break;
            }
            case 3: {
                System.out.println("The Result is : " + (firstNumber / secondNumber));
                break;
            }
            case 4: {
                System.out.println("The Result is : " + (firstNumber * secondNumber));
                break;
            }
            default:{
                System.out.println("Sorry! Wrong choice. Try again!");
            }
        }

    }

}
