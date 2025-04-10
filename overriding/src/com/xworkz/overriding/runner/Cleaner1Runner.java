package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Cleaner1;
import com.xworkz.overriding.internal.Vacuum;

public class Cleaner1Runner {
    public static void main(String[] args) {
        Cleaner1 cleaner = new Cleaner1();
        cleaner.describe();

        Vacuum vacuum = new Vacuum();
        vacuum.describe();
        vacuum.emptyDustBag();

        Cleaner1 basicVac = new Vacuum();
        basicVac.describe();
    }
}
