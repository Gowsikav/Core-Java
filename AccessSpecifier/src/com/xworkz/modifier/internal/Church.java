package com.xworkz.modifier.internal;

public class Church
{
    public Church() {
        System.out.println("Church constructor");
    }

    public void open() {
        System.out.println("public open method in Church");
    }

    private void close() {
        System.out.println("private close method in Church");
    }

    void display() {
        System.out.println("package-default display method in Church");
    }

}
