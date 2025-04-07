package com.xworkz.modifier.internal;

public class Temple
{
    public Temple()
    {
        System.out.println("Temple constructor");
    }
    public void open()
    {
        System.out.println("public open method in Temple");
    }
    private void close()
    {
        System.out.println("private close method in Temple");
    }
    void display()
    {
        System.out.println("package-default display method in Temple");
    }
}
