package com.sk.springbasics.game;


import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole{

    public void up(){
        System.out.println("Jumps into the sky.");
    }

    public void down(){
        System.out.println("Goes into the hole.");
    }
}
