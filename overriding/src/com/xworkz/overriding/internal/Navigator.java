package com.xworkz.overriding.internal;

public class Navigator extends Compass{
    public Navigator() {
        System.out.println("Navigator constructor");
    }

    @Override
    public void describe() {
        System.out.println("The navigator uses a compass to guide the team safely.");
    }

    public void plotCourse() {
        System.out.println("Plotting a course using maps and tools.");
    }
}
