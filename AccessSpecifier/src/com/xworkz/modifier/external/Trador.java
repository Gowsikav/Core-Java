package com.xworkz.modifier.external;

import com.xworkz.modifier.internal.Coin;

public class Trador
{
    public Trador() {
        System.out.println("Trader constructor");
    }

    public void trade() {
        System.out.println("running in trade method");
        Coin coin = new Coin();
        coin.flip();
    }
}
