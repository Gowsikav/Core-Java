package com.xworkz.modifier.internal;

public class Model
{
    public Model() {
        System.out.println("Model constructor");
    }

    public void showcase() {
        System.out.println("running in showcase method");
        Perfume perfume = new Perfume();
        perfume.spray();
        perfume.scentType();
    }
}
