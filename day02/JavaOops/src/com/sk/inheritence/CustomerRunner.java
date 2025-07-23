package com.sk.inheritence;

public class CustomerRunner {

    public static void main(String[] args) {

        Address homeAddress = new Address("Pune", "201, Main Road");
        Address workAddress = new Address("Bengaluru", "Marathahalli Road");
        Customer customer = new Customer("John Doe", homeAddress, workAddress);
        System.out.println(customer);

    }
}
