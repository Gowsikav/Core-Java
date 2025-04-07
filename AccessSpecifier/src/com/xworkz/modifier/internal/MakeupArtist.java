package com.xworkz.modifier.internal;

public class MakeupArtist
{
    public MakeupArtist() {
        System.out.println("MakeupArtist constructor");
    }

    public void makeup() {
        System.out.println("running in makeup method");
        Powder powder = new Powder();
        powder.apply();
        powder.smell();
    }
}
