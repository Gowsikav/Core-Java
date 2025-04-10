package com.xworkz.overriding.internal;

public class ChemicalTest extends Experiment{
    public ChemicalTest() {
        System.out.println("ChemicalTest constructor");
    }

    @Override
    public void describe() {
        System.out.println("A chemical test checks how substances react with each other.");
    }

    public void mixReagents() {
        System.out.println("Mixing reagents to observe a chemical change.");
    }
}
