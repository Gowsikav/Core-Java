package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.BasketballStick;
import com.xworkz.overriding.internal.HockeyStick1;

public class HockeyStick1Runner {
    public static void main(String[] args) {
        HockeyStick1 stick = new HockeyStick1();
        stick.describe();

        BasketballStick basketballStick = new BasketballStick();
        basketballStick.describe();
        basketballStick.checkGrip();

        HockeyStick1 gameStick = new BasketballStick();
        gameStick.describe();
    }
}
