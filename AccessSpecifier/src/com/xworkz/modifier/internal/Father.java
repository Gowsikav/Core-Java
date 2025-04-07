package com.xworkz.modifier.internal;

public class Father
{
    public Father() {
        System.out.println("Father constructor");
    }

    public void sermon()
    {
        System.out.println("running in sermon method");
        Church church = new Church();
        church.open();
        church.display();
    }
}
