package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Game;
import com.xworkz.overriding.internal.VideoGame;

public class GameRunner {
    public static void main(String[] args) {
        Game game = new Game();
        game.describe();

        VideoGame videoGame = new VideoGame();
        videoGame.describe();
        videoGame.play();

        Game game1 = new VideoGame();
        game1.describe();
    }
}
