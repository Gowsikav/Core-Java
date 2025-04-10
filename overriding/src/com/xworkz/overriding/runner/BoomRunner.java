package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.BackHoe;
import com.xworkz.overriding.internal.Boom;

public class BoomRunner {
    public static void main(String[] args) {
        Boom boom = new Boom();
        boom.describe();

        BackHoe backhoe = new BackHoe();
        backhoe.describe();
        backhoe.dig();

        Boom boom1 = new BackHoe();
        boom1.describe();
    }
}
