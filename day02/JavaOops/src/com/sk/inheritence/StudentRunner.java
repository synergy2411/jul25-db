package com.sk.inheritence;

public class StudentRunner {
    public static void main(String[] args) {

        Student student = new Student("John Doe", 23,  101);

//        System.out.println(student);
//
//        System.out.println(student.getDetails());

        Person person = new Student("Monica", 21, 102);

        System.out.println(person.getDetails());


    }
}
