package com.sk.threads;

public class ThreadRunner {

    public static void main(String[] args) {

        System.out.println("Thread Runner Main Started");
        TaskOne taskOne = new TaskOne();
        Thread t1 = new Thread(taskOne);
        System.out.println("Task One Thread State : " + t1.getState());
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        System.out.println("Task One Thread State : " + t1.getState());

        TaskTwo taskTwo = new TaskTwo();
        System.out.println("Task Two Thread State : " + taskTwo.getState());
        taskTwo.start();
        System.out.println("Task One Thread State : " + t1.getState());
        System.out.println("Thread Runner Main Ended");

    }
}
