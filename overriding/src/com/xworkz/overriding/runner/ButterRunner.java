package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Banister;
import com.xworkz.overriding.internal.Butter;

public class ButterRunner
{
    public static void main(String[] args) {
        Butter butter = new Butter();
        butter.describe();

        Banister banister = new Banister();
        banister.describe();
        banister.slide();

        Butter smoothWood = new Banister();
        smoothWood.describe();
    }
}
