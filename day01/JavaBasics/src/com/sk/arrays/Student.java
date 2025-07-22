package com.sk.arrays;

import java.math.BigDecimal;

public class Student {
    private String name;
    private int[] marks;


    public Student(String johnDoe, int[] marks) {
        this.name = name;
        this.marks = marks;
    }


    public int getNumberOfmarks() {
        return this.marks.length;
    }

    public int getTotalSumOfMarks() {
        int sum = 0;
        for(Integer mark : marks){
            sum += mark;
        }
        return sum;
    }

    public int getMaximumMark() {
        int maxMarks = Integer.MIN_VALUE;
        for(Integer mark : marks){
            if(maxMarks < mark){
                maxMarks = mark;
            }
        }
        return maxMarks;
    }

    public int getMinimumMark() {
        int minMarks = Integer.MAX_VALUE;
        for(Integer mark : marks){
            if(minMarks > mark){
                minMarks = mark;
            }
        }
        return minMarks;
    }

    public BigDecimal getAverageMarks() {
        double avgMarks  = getTotalSumOfMarks() / getNumberOfmarks();
        return new BigDecimal(avgMarks);
    }

    public int[] addMark(int newMark) {
         int[] extraMarks = new int[marks.length + 1];
         for(int i =0; i< marks.length; i++){
             extraMarks[i] = marks[i];
         }
         extraMarks[marks.length] = newMark;
         return extraMarks;
    }

    public int[] removeMarkAtIndex(int index) {
        int[] extraMarks = new int[marks.length -1];
        for(int i =0, j=0; i< marks.length; i++){
            if(i == index){
                continue;
            }
            extraMarks[j++] = marks[i];
        }
        return extraMarks;
    }
}
