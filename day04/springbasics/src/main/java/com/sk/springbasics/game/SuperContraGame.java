package com.sk.springbasics.game;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SuperContraGame implements GamingConsole {
    @Override
    public void up() {
        System.out.println("Shoot up into the sky.");
    }

    @Override
    public void down() {
        System.out.println("Sitting on the street.");
    }
}
