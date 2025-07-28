package com.sk.advanced.functional_programming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;

class PrintSomething {
    public static void print(String s){
        System.out.println(s);
    }
}


class MyPredicate implements Predicate<String>{

    /**
     * Evaluates this predicate on the given argument.
     *
     * @param s the input argument
     * @return {@code true} if the input argument matches the predicate,
     * otherwise {@code false}
     */
    @Override
    public boolean test(String s) {
        return s.endsWith("es");
    }
}

class Printing implements Consumer<String> {

    /**
     * Performs this operation on the given argument.
     *
     * @param s the input argument
     */
    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}

class MapValue implements Function<String, String>{

    /**
     * Applies this function to the given argument.
     *
     * @param s the function argument
     * @return the function result
     */
    @Override
    public String apply(String s) {
        return "My New Favorite : " + s;
    }
}

public class StreamExample {
    public static void main(String[] args) {

        IntStream.range(1, 11).boxed().map(number -> number * number).forEach(System.out::println);

        List<String> words = List.of("Apple", "Banana", "Cat");
        words.stream().map(String::toLowerCase).forEach(System.out::println);

        words.stream().map(String::length).forEach(System.out::println);



        List<String> fruits = List.of("Apple", "Banana", "Grapes", "Oranges", "Mangoes");
        fruits
                .stream()
                .filter(new MyPredicate())                          // Intermediate Operation
                .map(new MapValue())         // Intermediate Operation
                .forEach(new Printing());                 // Terminal Operation

//        fruits.forEach(PrintSomething::print);            // METHOD REFERENCING



    }
}
