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

        Animal a1 = new Animal();           // a1 -> xix009876
        Animal a2 = new Animal();           // a2 -> xix0987654321
        Animal a3 = a1;                     // a3 -> xix009876
        System.out.println(a1 == a2);       // false
        System.out.println(a3 == a1);       // true
        a3.setName("Elephant");
        a3.setLegs(4);
        a1.getDetails();        //

        int numberOne = 10;
        int numberTwo = numberOne;
        numberTwo = numberTwo +  1;
        System.out.println("Number One : "+ numberOne);

    }

}
