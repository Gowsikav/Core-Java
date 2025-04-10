package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Building1;
import com.xworkz.overriding.internal.SkyScraper;

public class Building1Runner
{
    public static void main(String[] args) {
        Building1 building = new Building1();
        building.describe();

        SkyScraper sky = new SkyScraper();
        sky.describe();
        sky.viewCity();

        Building1 building1 = new SkyScraper();
        building1.describe();
    }
}
