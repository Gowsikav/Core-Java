package com.xworkz.overriding.internal;

public class GamingConsole extends Console{
    public GamingConsole() {
        System.out.println("GamingConsole constructor");
    }

    @Override
    public void describe() {
        System.out.println("A gaming console allows users to play video games.");
    }

    public void loadGame() {
        System.out.println("Loading a high-definition game on the console.");
    }
}
