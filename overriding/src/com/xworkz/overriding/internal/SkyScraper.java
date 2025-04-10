package com.xworkz.overriding.internal;

public class SkyScraper extends Building1{
    public SkyScraper() {
        System.out.println("Skyscraper constructor");
    }

    @Override
    public void describe() {
        System.out.println("This is a tall skyscraper with many floors.");
    }

    public void viewCity() {
        System.out.println("Enjoying the city view from the top floor.");
    }
}
