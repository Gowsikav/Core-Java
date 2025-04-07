package com.xworkz.modifier.internal;

public class Shell
{
    public Shell() {
        System.out.println("Shell constructor");
    }

    public void crack() {
        System.out.println("public crack method in Shell");
    }

    private void polish() {
        System.out.println("private polish method in Shell");
    }

    void observe() {
        System.out.println("package-default observe method in Shell");
    }
}
