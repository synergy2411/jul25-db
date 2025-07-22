package com.sk.oops_basics;

public class Animal {

    private String name;
    private int legs;

    public Animal() {
    }

    public Animal(String name, int legs) {
        this.name = name;
        this.legs = legs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void getDetails() {
        System.out.println(name + " is having " + legs + " legs!");
    }

    public void eat() {
        System.out.println(name + "is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

}
