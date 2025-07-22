package com.sk.string_date;

public class StringDemo {

    public static void main(String[] args) {

        String greet = "Hello";

        greet.indexOf("l");     // 2
        greet.lastIndexOf("l");     // 3
        System.out.println(greet.startsWith("H"));
        System.out.println(greet.isEmpty());




        String concatedString = greet.concat(" World");

        System.out.println("Greeting : " + greet);      // "Hello"
        System.out.println("Greet Again : " + concatedString);

        System.out.println(greet.equals(concatedString));

        StringBuilder sb = new StringBuilder("Some Cool Text");

        sb.append(" is available here!");

        System.out.println(sb);
    }
}
