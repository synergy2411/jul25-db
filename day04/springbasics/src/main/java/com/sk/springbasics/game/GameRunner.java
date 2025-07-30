package com.sk.springbasics.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
//    @Autowired
    GamingConsole game;

//    @Autowired
    public GameRunner(@Qualifier("marioGame") GamingConsole game) {
        this.game = game;
    }

    public void run(){
        game.up();
        game.down();
    }
}