package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Bottle;
import com.xworkz.overriding.internal.Oil;

public class OilRunner
{
    public static void main(String[] args) {
        Oil oil = new Oil();
        oil.describe();

        Bottle bottle = new Bottle();
        bottle.describe();
        bottle.pour();

        Oil oil1 = new Bottle();
        oil1.describe();
    }
}
