package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Balloon;
import com.xworkz.overriding.internal.Biscuits;

public class BalloonRunner {
    public static void main(String[] args) {
        Balloon balloon = new Balloon();
        balloon.describe();

        Biscuits biscuitBalloon = new Biscuits();
        biscuitBalloon.describe();
        biscuitBalloon.inflate();

        Balloon funBalloon = new Biscuits();
        funBalloon.describe();
    }
}
