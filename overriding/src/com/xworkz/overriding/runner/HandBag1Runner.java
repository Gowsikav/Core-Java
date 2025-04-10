package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.DesignerHandbag;
import com.xworkz.overriding.internal.Handbag1;

public class HandBag1Runner {
    public static void main(String[] args) {
        Handbag1 regularHandbag = new Handbag1();
        regularHandbag.describe();

        DesignerHandbag luxuryHandbag = new DesignerHandbag();
        luxuryHandbag.describe();
        luxuryHandbag.showBrand();

        Handbag1 highEndHandbag = new DesignerHandbag();
        highEndHandbag.describe();
    }
}
