package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.FloweringPlant;
import com.xworkz.overriding.internal.Plant1;

public class Plant1Runner {
    public static void main(String[] args) {
        Plant1 basicPlant = new Plant1();
        basicPlant.describe();

        FloweringPlant floweringPlant = new FloweringPlant();
        floweringPlant.describe();
        floweringPlant.bloomFlowers();

        Plant1 gardenPlant = new FloweringPlant();
        gardenPlant.describe();
    }
}
