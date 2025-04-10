package com.xworkz.overriding.internal;

public class OnlineCourse extends Course
{
    public OnlineCourse() {
        System.out.println("OnlineCourse constructor");
    }

    @Override
    public void describe() {
        System.out.println("This is an online course accessible via the internet.");
    }

    public void startLearning() {
        System.out.println("Starting the online course now.");
    }
}
