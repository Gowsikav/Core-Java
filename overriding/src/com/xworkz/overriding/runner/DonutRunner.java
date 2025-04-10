package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.ChocolateDonut;
import com.xworkz.overriding.internal.Donut;

public class DonutRunner {
    public static void main(String[] args) {
        Donut basicDonut = new Donut();
        basicDonut.describe();

        ChocolateDonut chocDonut = new ChocolateDonut();
        chocDonut.describe();
        chocDonut.addSprinkles();

        Donut sweetDonut = new ChocolateDonut();
        sweetDonut.describe();
    }
}
