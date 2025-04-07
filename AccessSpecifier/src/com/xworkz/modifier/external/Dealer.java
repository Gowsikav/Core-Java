package com.xworkz.modifier.external;

import com.xworkz.modifier.internal.Card;

public class Dealer
{
    public Dealer() {
        System.out.println("Dealer constructor");
    }

    public void distribute() {
        System.out.println("running in distribute method");
        Card card = new Card();
        card.swipe();
    }
}
