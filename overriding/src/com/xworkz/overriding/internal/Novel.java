package com.xworkz.overriding.internal;

public class Novel extends Book{
    public Novel() {
        System.out.println("Novel constructor");
    }

    @Override
    public void describe() {
        System.out.println("This is a novel, a type of book with a story.");
    }

    public void readStory() {
        System.out.println("Reading an interesting story from the novel.");
    }
}
