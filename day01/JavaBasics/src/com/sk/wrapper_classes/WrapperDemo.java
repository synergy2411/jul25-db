package com.sk.wrapper_classes;

public class WrapperDemo {
    public static void main(String[] args) {
        Character c = 'C';
        Character ch = Character.valueOf('C');
        Character choice = 'C';

        System.out.println("MAX VALUE : " + Character.MIN_VALUE);

        System.out.println(c == ch);
        System.out.println(choice == c);

        Integer numberOne = Integer.valueOf(10);
        int numberTwo = 10;
        System.out.println("Max Integer : " + Integer.MAX_VALUE);
        System.out.println("Min Integer : " + Integer.MIN_VALUE);
        System.out.println("Integer Size : " + Integer.SIZE);
        System.out.println("Short Size : " + Short.SIZE);
        System.out.println("Byte Size : " + Byte.SIZE);

        int intVar = 1000000000;

        byte b = 120;
        Byte byt = b;

        Byte intByte = (byte) intVar;

        System.out.println("Byte : " + byt);
        System.out.println("Int Byte : " + intByte);

        Short s = 101;
        Integer intValue = Integer.valueOf((s));
        System.out.println("Integer Value : " + intValue);

    }
}

//Auto-boxing : Converts Primitive into Reference Type
//Unboxing : Converts Reference Type into Primitive