package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Food;
import com.xworkz.overriding.internal.Pizza;

public class FoodRunner
{
    public static void main(String[] args) {
        Food food = new Food();
        food.describe();

        Pizza pizza = new Pizza();
        pizza.describe();
        pizza.eat();

        Food food1 = new Pizza();
        food1.describe();
    }
}
