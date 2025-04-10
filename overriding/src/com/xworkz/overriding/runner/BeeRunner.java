package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Barbecue;
import com.xworkz.overriding.internal.Bee;

public class BeeRunner {
    public static void main(String[] args) {
        Bee bee = new Bee();
        bee.describe();

        Barbecue bbq = new Barbecue();
        bbq.describe();
        bbq.grill();

        Bee beeTheme = new Barbecue();
        beeTheme.describe();
    }
}
