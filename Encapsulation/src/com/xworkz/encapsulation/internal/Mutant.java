package com.xworkz.encapsulation.internal;

public class Mutant
{
    private String mutationType;
    private int powerLevel;
    private String origin;
    private boolean isHostile;
    private String codeName;

    public Mutant()
    {
        System.out.println("Mutant Constructor");
    }

    public String getMutationType() {
        return mutationType;
    }

     void setMutationType(String mutationType) {
        this.mutationType = mutationType;
    }

     public int getPowerLevel() {
        return powerLevel;
    }

     void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }

     public String getOrigin() {
        return origin;
    }

     void setOrigin(String origin) {
        this.origin = origin;
    }

     public boolean isHostile() {
        return isHostile;
    }

     void setHostile(boolean hostile) {
        isHostile = hostile;
    }

     public String getCodeName() {
        return codeName;
    }

     void setCodeName(String codeName) {
        this.codeName = codeName;
    }
}
