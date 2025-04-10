package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Hat;
import com.xworkz.overriding.internal.TopHat;

public class HatRunner {
    public static void main(String[] args) {
        Hat simpleHat = new Hat();
        simpleHat.describe();

        TopHat formalHat = new TopHat();
        formalHat.describe();
        formalHat.adjustFit();

        Hat elegantHat = new TopHat();
        elegantHat.describe();
    }
}
