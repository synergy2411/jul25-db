package com.sk.interfaces;

public class GameRunner {

    public static void main(String[] args) {

//        MarioGame game = new MarioGame();
//        SuperContraGame game = new SuperContraGame();

//        IGame game = new MarioGame();
        IGame game = new SuperContraGame();

        GamingConsole console = new GamingConsole(game);

        console.run();
    }
}
