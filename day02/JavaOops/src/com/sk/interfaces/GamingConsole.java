package com.sk.interfaces;

public class GamingConsole {

    IGame game ;

    public GamingConsole(IGame game) {
        this.game = game;
    }

    public void run(){
        game.up();
        game.down();
    }
}
