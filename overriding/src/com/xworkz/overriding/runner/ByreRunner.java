package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Bell1;
import com.xworkz.overriding.internal.Byre;

public class ByreRunner {
    public static void main(String[] args) {
        Byre byre = new Byre();
        byre.describe();

        Bell1 bell = new Bell1();
        bell.describe();
        bell.jingle();

        Byre byre1 = new Bell1();
        byre1.describe();
    }
}
