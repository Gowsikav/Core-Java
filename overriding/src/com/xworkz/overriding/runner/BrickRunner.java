package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Brick;
import com.xworkz.overriding.internal.CementBrick;

public class BrickRunner {
    public static void main(String[] args) {
        Brick basicBrick = new Brick();
        basicBrick.describe();

        CementBrick cementBrick = new CementBrick();
        cementBrick.describe();
        cementBrick.checkDurability();

        Brick buildingMaterial = new CementBrick();
        buildingMaterial.describe();
    }
}
