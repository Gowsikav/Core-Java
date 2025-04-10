package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Plant;
import com.xworkz.overriding.internal.Rose;

public class PlantRunner
{
    public static void main(String[] args) {
        Plant plant = new Plant();
        plant.describe();

        Rose rose = new Rose();
        rose.describe();
        rose.smell();

        Plant plant1 = new Rose();
        plant1.describe();
    }
}
