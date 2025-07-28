package com.sk.advanced.collections.list;

import java.util.*;

public class ListRunner {
    public static void main(String[] args) {

        List<String> fruits = List.of("Apple", "Grapes", "Kiwi", "Banana", "Oranges");
//        List<String> fruitsLL = new ArrayList<>(fruits);          // POSITIONAL ACCESS
        List<String> fruitsLL = new LinkedList<>(fruits);           // INSERT OR DELETE
        fruitsLL.add("Mangoes");
        fruitsLL.add(2, "Apricot");
        fruitsLL.add(4, "Mangoes");
        fruitsLL.set(3, "Kiwis");
        fruitsLL.remove(5);
        fruitsLL.remove("Mangoes");
        System.out.println(fruitsLL);
        for(String fruit : fruitsLL){
            System.out.println(fruit);
        }
        Collections.sort(fruitsLL);
        System.out.println(fruitsLL);
    }
}
