package com.xworkz.modifier.internal;

public class Player
{
    public Player() {
        System.out.println("Player constructor");
    }

    public void play() {
        System.out.println("running in play method");
        Card card = new Card();
        card.swipe();
        card.validate();
    }
}
