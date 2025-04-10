package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Art;
import com.xworkz.overriding.internal.OilPainting;

public class ArtRunner {
    public static void main(String[] args) {
        Art creativeWork = new Art();
        creativeWork.describe();

        OilPainting monaLisa = new OilPainting();
        monaLisa.describe();
        monaLisa.frameIt();

        Art masterpiece = new OilPainting();
        masterpiece.describe();
    }
}
