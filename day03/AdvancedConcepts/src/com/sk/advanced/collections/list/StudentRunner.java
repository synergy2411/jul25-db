package com.sk.advanced.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentRunner {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student(105, "Monica"),
                new Student(101, "Ross"),
                new Student(109, "Rachel"),
                new Student(103, "Joey")
        );

        List<Student> studentsAL = new ArrayList<>(students);
//        Collections.sort(studentsAL, new StudentAscendingComparator());
        studentsAL.sort(new StudentAscendingComparator());
        System.out.println("Ascending Order :" + studentsAL);

//        Collections.sort(studentsAL, new StudentDecendingComparator());
        studentsAL.sort(new StudentDecendingComparator());
        System.out.println("Descending Order : " + studentsAL);
//        Collections.sort(studentsAL);
//        System.out.println(studentsAL);


    }
}
