package com.sk.arrays;

import java.math.BigDecimal;
import java.util.Arrays;

public class StudentRunner {
    public static void main(String[] args) {

        int[] marks = {99, 98, 97, 96, 99, 94, 91, 89};

        Student student = new Student("John Doe", marks);
        int number = student.getNumberOfmarks();
        System.out.println("Total Length : " + number);
        int sum = student.getTotalSumOfMarks();
        System.out.println("Total Sum : " + sum);
        int maximumMark = student.getMaximumMark();
        System.out.println("Max Marks : " + maximumMark);
        int minimumMark = student.getMinimumMark();
        System.out.println("Min Marks : "+ minimumMark);
        BigDecimal average = student.getAverageMarks();
        System.out.println("Average : " + average);
        int[] extraMarks = student.addMark(35);
        System.out.println(Arrays.toString(extraMarks));
        int[] reducedMarks = student.removeMarkAtIndex(5);
        System.out.println("Reduced Marks : " + Arrays.toString(reducedMarks));


//        int[] marks = {99, 98, 97, 96, 99, 94, 91, 89};
//
//        for (int i = 0; i < marks.length; i++) {
//            System.out.println(marks[i]);
//        }
//
//        for(Integer mark : marks){
//            System.out.println("Enhanced : " + mark);
//        }

    }
}
