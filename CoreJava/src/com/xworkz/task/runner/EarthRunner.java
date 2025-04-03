package com.xworkz.task.runner;

import com.xworkz.task.Earth;
import com.xworkz.task.Planet;

public class EarthRunner {
    public static void main(String[] args) {
        Earth earth = new Earth();
        Planet planet = new Planet(earth);
        planet.invoke();
    }
}
