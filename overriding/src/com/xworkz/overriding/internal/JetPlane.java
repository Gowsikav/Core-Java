package com.xworkz.overriding.internal;

public class JetPlane extends Aircraft{
    public JetPlane() {
        System.out.println("JetPlane constructor");
    }

    @Override
    public void describe() {
        System.out.println("A jet plane flies at high speed using jet engines.");
    }

    public void engageTurbo() {
        System.out.println("Engaging turbo mode on the jet plane.");
    }
}
