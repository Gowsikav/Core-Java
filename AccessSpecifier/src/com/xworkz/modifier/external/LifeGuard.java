package com.xworkz.modifier.external;
import com.xworkz.modifier.internal.Beach;

public class LifeGuard
{
    public LifeGuard() {
        System.out.println("Lifeguard constructor");
    }

    public void monitor() {
        System.out.println("running in monitor method");
        Beach beach = new Beach();
        beach.enter();

    }
}
