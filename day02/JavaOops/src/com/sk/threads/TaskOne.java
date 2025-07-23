package com.sk.threads;

public class TaskOne implements Runnable{
    /**
     * Runs this operation.
     */
    @Override
    public void run() {
        System.out.println("Task One Started");
//        try {
//            Thread.sleep(1500);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        for(int i =100; i<=199; i++){
            System.out.print(i + " ");
        }
        System.out.println("Task One Ended");
    }
}
