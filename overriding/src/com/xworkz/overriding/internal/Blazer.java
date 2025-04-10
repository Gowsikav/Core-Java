package com.xworkz.overriding.internal;

public class Blazer extends BackLighting{
    public Blazer() {
        System.out.println("Blazer constructor");
    }

    @Override
    public void describe() {
        System.out.println("This blazer features stylish backlighting – ideal for evening events.");
    }

    public void glow() {
        System.out.println("The blazer lights up – you're the star of the party!");
    }
}
