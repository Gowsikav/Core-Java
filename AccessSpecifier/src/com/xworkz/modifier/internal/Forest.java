package com.xworkz.modifier.internal;

public class Forest
{
    public Forest() {
        System.out.println("Forest constructor");
    }

    public void explore() {
        System.out.println("public explore method in Forest");
    }

    private void protect() {
        System.out.println("private protect method in Forest");
    }

    void plantTrees() {
        System.out.println("package-default plantTrees method in Forest");
    }
}
