package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Building;
import com.xworkz.overriding.internal.House;

public class BuildingRunner
{
    public static void main(String[] args) {
        Building building = new Building();
        building.describe();

        House house = new House();
        house.describe();
        house.live();

        Building building1 = new House();
        building1.describe();
    }
}
