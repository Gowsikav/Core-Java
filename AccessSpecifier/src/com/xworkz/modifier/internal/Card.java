package com.xworkz.modifier.internal;

public class Card
{
    public Card() {
        System.out.println("Card constructor");
    }

    public void swipe() {
        System.out.println("public swipe method in Card");
    }

    private void encode() {
        System.out.println("private encode method in Card");
    }

    void validate() {
        System.out.println("package-default validate method in Card");
    }
}
