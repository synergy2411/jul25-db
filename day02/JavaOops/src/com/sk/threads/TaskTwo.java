package com.sk.threads;

public class TaskTwo extends Thread{

    public void run(){
        System.out.println("Task Two Started");
            for(int i = 201; i<= 299; i++){
                System.out.print(i + " ");
            }
        System.out.println("Task Two Endeded");
    }
}
