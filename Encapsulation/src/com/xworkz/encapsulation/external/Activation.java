package com.xworkz.encapsulation.external;


import com.xworkz.encapsulation.internal.Mutant;

public class Activation
{
    Mutant mutant;
    public Activation(Mutant mutant)
    {
        this.mutant=mutant;
        System.out.println("Activation constructor");
    }
    public void run()
    {
        System.out.println("Code Name: " + mutant.getCodeName());
        System.out.println("Type: " + mutant.getMutationType());
        System.out.println("Power Level: " + mutant.getPowerLevel());
        System.out.println("Origin: " + mutant.getOrigin());
        System.out.println("Hostile: " + mutant.isHostile());
    }
}
