package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Bag;
import com.xworkz.overriding.internal.BokChoy;

public class BoychoyRunner
{
    public static void main(String[] args) {
        BokChoy veggie = new BokChoy();
        veggie.describe();

        Bag veggieBag = new Bag();
        veggieBag.describe();
        veggieBag.carry();

        BokChoy packedVeggie = new Bag();
        packedVeggie.describe();
    }
}
