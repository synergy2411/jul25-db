package com.sk.inheritence;

public class Student extends Person {

    private int rollNumber;

    public Student(String name, int age, int rollNumber) {
        super(name, age);           // Calling Super Class Constructor
        this.rollNumber = rollNumber;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getDetails(){
        return "RollNumber : " + rollNumber +  "\n" + super.getDetails();
    }

    @Override
    public String toString() {
        return
                "Student{" +
                        "rollNumber=" + rollNumber + " " +
                        "Student Name=" + super.getName() + " " +
                        "Student Age=" + super.getAge() +
                        '}';
    }
}
