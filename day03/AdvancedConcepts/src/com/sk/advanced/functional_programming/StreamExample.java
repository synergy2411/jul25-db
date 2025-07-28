package com.sk.advanced.functional_programming;

import java.util.List;

class PrintSomething {
    public static void print(String s){
        System.out.println(s);
    }
}

public class StreamExample {
    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Banana", "Grapes", "Oranges", "Mangoes");
        fruits
                .stream()
                .filter(fruit -> fruit.endsWith("es"))          // Intermediate Operation
                .forEach((fruit) -> System.out.println(fruit)); // Terminal Operation

//        fruits.forEach(PrintSomething::print);            // METHOD REFERENCING



    }
}
