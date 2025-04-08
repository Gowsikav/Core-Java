package com.xworkz.encapsulation.internal;

public class MutationLab
{
    Mutant mutant;
    public MutationLab(Mutant mutant)
    {
        this.mutant=mutant;
        System.out.println("MutationLab constructor");
    }
    public void mutate()
    {
        mutant.setMutationType("Telepathy");
        mutant.setPowerLevel(92);
        mutant.setOrigin("X-Lab");
        mutant.setHostile(false);
        mutant.setCodeName("MindBender");

        System.out.println("Code Name: " + mutant.getCodeName());
        System.out.println("Type: " + mutant.getMutationType());
        System.out.println("Power Level: " + mutant.getPowerLevel());
        System.out.println("Origin: " + mutant.getOrigin());
        System.out.println("Hostile: " + mutant.isHostile());
    }

}
