package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Beverage1;
import com.xworkz.overriding.internal.Coffee;

public class Beverage1Runner {
    public static void main(String[] args) {
        Beverage1 drink = new Beverage1();
        drink.describe();

        Coffee espresso = new Coffee();
        espresso.describe();
        espresso.addMilk();

        Beverage1 morningDrink = new Coffee();
        morningDrink.describe();
    }
}
