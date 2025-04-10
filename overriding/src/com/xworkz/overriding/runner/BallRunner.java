package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Ball;
import com.xworkz.overriding.internal.Battery;

public class BallRunner
{
    public static void main(String[] args) {
        Ball ball = new Ball();
        ball.describe();

        Battery batteryBall = new Battery();
        batteryBall.describe();
        batteryBall.charge();

        Ball smartBall = new Battery();
        smartBall.describe();
    }
}
