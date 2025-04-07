package com.xworkz.modifier.internal;

public class Collector
{
    public Collector() {
        System.out.println("Collector constructor");
    }

    public void collect() {
        System.out.println("running in collect method");
        Coin coin = new Coin();
        coin.flip();
        coin.inspect();
    }
}
