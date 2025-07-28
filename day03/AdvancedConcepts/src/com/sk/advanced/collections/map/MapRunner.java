package com.sk.advanced.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapRunner {
    public static void main(String[] args) {

//        Map<String, Integer> coursesMap = new TreeMap<>();
//        coursesMap.put("React", 100);
//        coursesMap.put("Angular", 140);
//        coursesMap.put("Spring", 120);
//
//        Integer numberOfStudents = coursesMap.get("Spring");
//        System.out.println("Spring Student : " + numberOfStudents);
//
//        System.out.println(coursesMap);


        String str = "This is an awesome occasion. This has never happened before.";
        Map<Character, Integer> letterOccurrences = new HashMap<>();
        char[] charArray = str.toCharArray();
        for(char character : charArray){
            Integer i = letterOccurrences.get(character);
            if(i == null){
                letterOccurrences.put(character, 1);
            }else{
                letterOccurrences.put(character, i + 1);
            }
        }
        System.out.println(letterOccurrences);

        Map<String, Integer> wordOccurrence = new HashMap<>();
        String[] words = str.split(" ");
        for(String word : words){
            Integer i = wordOccurrence.get(word);
            if(i == null ){
                wordOccurrence.put(word, 1);
            }else{
                wordOccurrence.put(word, i +1);
            }
        }
        System.out.println(wordOccurrence);
    }
}
