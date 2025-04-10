package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Boots;
import com.xworkz.overriding.internal.Brake;

public class BootsRunner
{
    public static void main(String[] args) {
        Boots boots = new Boots();
        boots.describe();

        Brake brake = new Brake();
        brake.describe();
        brake.stop();

        Boots boots1 = new Brake();
        boots1.describe();
    }
}
