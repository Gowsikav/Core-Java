package com.xworkz.modifier.internal;

public class Beach
{
    public Beach() {
        System.out.println("Beach constructor");
    }

    public void enter() {
        System.out.println("public enter method in Beach");
    }

    private void clean() {
        System.out.println("private clean method in Beach");
    }

    void relax() {
        System.out.println("package-default relax method in Beach");
    }
}
