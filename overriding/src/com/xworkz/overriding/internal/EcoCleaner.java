package com.xworkz.overriding.internal;

public class EcoCleaner extends AjaxCleaner{
    public EcoCleaner() {
        System.out.println("EcoCleaner constructor");
    }

    @Override
    public void describe() {
        System.out.println("EcoCleaner is a non-toxic, eco-friendly cleaning product.");
    }

    public void refill() {
        System.out.println("Refilling the EcoCleaner bottle with eco-friendly solution.");
    }
}
