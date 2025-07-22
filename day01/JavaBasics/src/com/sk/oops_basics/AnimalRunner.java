package com.sk.oops_basics;

public class AnimalRunner {

    public static void main(String[] args) {
        Animal cat = new Animal("Cat", 4);
        cat.eat();
        cat.sleep();

        Animal dog = new Animal("Dog", 4);
        dog.eat();
        dog.sleep();

        Animal tiger = new Animal();
        tiger.setName("Tiger");
        tiger.setLegs(4);
        tiger.getDetails();
    }

}
