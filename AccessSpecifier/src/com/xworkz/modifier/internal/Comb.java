package com.xworkz.modifier.internal;

public class Comb
{
    public Comb() {
        System.out.println("Comb constructor");
    }

    public void use() {
        System.out.println("public use method in Comb");
    }

    private void clean() {
        System.out.println("private clean method in Comb");
    }

    void checkTeeth() {
        System.out.println("package-default checkTeeth method in Comb");
    }
}
