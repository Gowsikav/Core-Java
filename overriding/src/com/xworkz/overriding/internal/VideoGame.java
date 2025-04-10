package com.xworkz.overriding.internal;

public class VideoGame extends Game
{
    public VideoGame() {
        System.out.println("VideoGame constructor");
    }

    @Override
    public void describe() {
        System.out.println("This is a video game with graphics and interactivity.");
    }

    public void play() {
        System.out.println("Playing the video game.");
    }
}
